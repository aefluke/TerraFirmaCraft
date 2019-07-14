/*
 * Work under Copyright. Licensed under the EUPL.
 * See the project README.md and LICENSE.txt for more information.
 */

package net.dries007.tfc.objects.entity.animal;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import net.dries007.tfc.util.calendar.CalendarTFC;

public abstract class EntityAnimalMammal extends EntityAnimalTFC
{
    private long pregnantTime; //The time(in days) this entity became pregnant

    public EntityAnimalMammal(World worldIn, Gender gender, int birthDay)
    {
        super(worldIn, gender, birthDay);
        this.pregnantTime = -1;
    }

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        if (!this.world.isRemote)
        {
            if (this.isFertilized() && CalendarTFC.INSTANCE.getTotalDays() >= pregnantTime + gestationDays())
            {
                birthChildren();
                this.setFertilized(false);
            }
            if (pregnantTime > -1 && pregnantTime > CalendarTFC.INSTANCE.getTotalDays())
            {
                //Calendar went backwards by command! this need to update
                this.pregnantTime = CalendarTFC.INSTANCE.getTotalDays();
            }
        }
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nbt)
    {
        super.writeEntityToNBT(nbt);
        nbt.setLong("pregnant", pregnantTime);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound nbt)
    {
        super.readEntityFromNBT(nbt);
        this.pregnantTime = nbt.getLong("pregnant");
    }

    public void onFertilized(EntityAnimalTFC male)
    {
        //Mark the day this female became pregnant
        this.pregnantTime = CalendarTFC.INSTANCE.getTotalDays();
    }

    /**
     * Spawns children of this animal
     */
    public abstract void birthChildren();

    /**
     * Return the number of days for a full gestation
     *
     * @return long value in days
     */
    public abstract long gestationDays();
}
