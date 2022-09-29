package by.epam.catalog.appliance.kitchenАppliance;

import java.io.Serializable;
import java.util.Objects;

public class Refrigerator extends KitchenAppliance implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int freezerCapacity;
	private int overallCapacity;

	public Refrigerator()
	{
            super();
	}

	public Refrigerator(String name, double price, int powerConsumption, int weight, double height, double width,
			int freezerCapacity, int overallCapacity)
	{
		super(name, price, powerConsumption, weight, height, width);
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity)
	{
		this.freezerCapacity = freezerCapacity;
	}

	public int getFreezerCapacity()
	{
		return freezerCapacity;
	}

	public void setOverallCapacity(int overallCapacity)
	{
		this.overallCapacity = overallCapacity;
	}

	public int getOverallCapacity()
	{
		return overallCapacity;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(freezerCapacity, overallCapacity);
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
		Refrigerator other = (Refrigerator) obj;
		return freezerCapacity == other.freezerCapacity && overallCapacity == other.overallCapacity;
	}

	@Override
	public String toString()
	{
		return "Refrigerator [freezerCapacity=" + freezerCapacity + ", overallCapacity=" + overallCapacity + "]";
	}

}
