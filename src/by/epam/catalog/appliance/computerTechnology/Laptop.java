package by.epam.catalog.appliance.computerTechnology;

import java.io.Serializable;
import java.util.Objects;

public class Laptop extends PersonalComputer implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String os;
	private int systemMemory;
	private double cpu;

	public Laptop()
	{
	}

	public Laptop(String name, double price, double batteryCapacity, String os, int memoryRom, int systemMemory,
			double cpu, int displayInches)
	{
		super(name, price, batteryCapacity, displayInches, memoryRom);
		this.os = os;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
	}

	public void setOs(String os)
	{
		this.os = os;
	}

	public String getOs()
	{
		return os;
	}

	public void setSystemMemory(int systemMemory)
	{
		this.systemMemory = systemMemory;
	}

	public int getSystemMemory()
	{
		return systemMemory;
	}

	public void setCpu(double cpu)
	{
		this.cpu = cpu;
	}

	public double getCpu()
	{
		return cpu;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cpu, os, systemMemory);
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
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(cpu) == Double.doubleToLongBits(other.cpu) && Objects.equals(os, other.os)
				&& systemMemory == other.systemMemory;
	}

	@Override
	public String toString()
	{
		return "Laptop [os=" + os + ", systemMemory=" + systemMemory + ", cpu=" + cpu + "]";
	}

}
