package by.epam.catalog.appliance.computerTechnology;

import java.io.Serializable;
import java.util.Objects;

public class TabletPC extends PersonalComputer implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int flashMemoryCapacity;
	private String color;

	public TabletPC()
	{
	}

	public TabletPC(String name, double price, double batteryCapacity, int memoryRom, int displayInches,
			int flashMemoryCapacity, String color)
	{
		super(name, price, batteryCapacity, memoryRom, displayInches);
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
	}

	public void setFlashMemoryCapacity(int flashMemoryCapacity)
	{
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public int getFlashMemoryCapacity()
	{
		return flashMemoryCapacity;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getColor()
	{
		return color;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(color, flashMemoryCapacity);
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
		TabletPC other = (TabletPC) obj;
		return Objects.equals(color, other.color) && flashMemoryCapacity == other.flashMemoryCapacity;
	}

	@Override
	public String toString()
	{
		return "TabletPC [flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
	}

}
