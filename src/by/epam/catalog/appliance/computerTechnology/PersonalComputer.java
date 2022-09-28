package by.epam.catalog.appliance.computerTechnology;

import java.io.Serializable;
import java.util.Objects;

import by.epam.catalog.appliance.Appliance;

public class PersonalComputer extends Appliance implements Serializable
{
	private static final long serialVersionUID = 1L;

	private double batteryCapacity;
	private int memoryRom;
	private int displayInches;

	public PersonalComputer()
	{
	}

	public PersonalComputer(String name, double price, double batteryCapacity, int memoryRom, int displayInches)
	{
		super(name, price);
		this.batteryCapacity = batteryCapacity;
		this.memoryRom = memoryRom;
		this.displayInches = displayInches;
	}

	public void setBatteryCapacity(double batteryCapacity)
	{
		this.batteryCapacity = batteryCapacity;
	}

	public double getBatteryCapacity()
	{
		return batteryCapacity;
	}

	public void setMemoryRom(int memoryRom)
	{
		this.memoryRom = memoryRom;
	}

	public int getMemoryRom()
	{
		return memoryRom;
	}

	public void setDisplayInches(int displayInches)
	{
		this.displayInches = displayInches;
	}

	public int getDisplayInches()
	{
		return displayInches;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(batteryCapacity, displayInches, memoryRom);
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonalComputer other = (PersonalComputer) obj;
		return Double.doubleToLongBits(batteryCapacity) == Double.doubleToLongBits(other.batteryCapacity)
				&& displayInches == other.displayInches && memoryRom == other.memoryRom;
	}

	@Override
	public String toString()
	{
		return "PersonalComputer [batteryCapacity=" + batteryCapacity + ", memoryRom=" + memoryRom + ", displayInches="
				+ displayInches + "]";
	}

}
