package by.epam.catalog.appliance.kitchenАppliance;

import java.io.Serializable;
import java.util.Objects;

import by.epam.catalog.appliance.Appliance;

public class KitchenAppliance extends Appliance implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int powerConsumption;
	private int weight;
	private double height;
	private double width;

	public KitchenAppliance()
	{
            super();
	}

	public KitchenAppliance(String name, double price, int powerConsumption, int weight, double height, double width)
	{
		super(name, price);
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.height = height;
		this.width = width;
	}

	public void setPowerConsumption(int powerConsumption)
	{
		this.powerConsumption = powerConsumption;
	}

	public int getPowerConsumption()
	{
		return powerConsumption;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public double getHeight()
	{
		return height;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}

	public double getWidth()
	{
		return width;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(height, powerConsumption, weight, width);
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
		KitchenAppliance other = (KitchenAppliance) obj;
		return Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& powerConsumption == other.powerConsumption && weight == other.weight
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString()
	{
		return "KitchenAppliance [powerConsumption=" + powerConsumption + ", weight=" + weight + ", height=" + height
				+ ", width=" + width + "]";
	}

}
