package com.project;

public class ParkingSlot
{
    // fields of the class
    private Vehicle vh;
    private Vehicle siz;
    private int lane;
    private int slotNumber;
    private Level l;

    // constructor of the class
    public ParkingSlot(Level lvl, int r, int num, Vehicle vs)
    {
        l = lvl;
        lane = r;
        slotNumber = num;
        siz = vs;
    }


    public boolean isAvailable()
    {
        return vh == null;
    }

    public boolean canFitVehicle(Vehicle vh)
    {
//check if the spot is big enough and is available
        return isAvailable() && vh.canFitInSlot(this);
    }

    public boolean park(Vehicle vObj)
    {
        if (!canFitVehicle(vObj))
        {
            return false;
        }

        vh = vObj;
        vh.parkInSlot(this);
        return true;
    }

    // get method for lane
    public int getLane()
    {
        return lane;
    }

    // get method for slot number
    public int getSlotNumber()
    {
        return slotNumber;
    }

    // get method for getting the Size
    public Vehicle getSize()
    {
        return siz;
    }

    // method for removing the vehicle from the parking lot
    public void removeVehicle()
    {
        l.slotFreed();
        vh = null;
    }
}
