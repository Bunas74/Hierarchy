package by.epam.catalog.appliance.kitchenАppliance;

import java.io.Serializable;
import java.util.Objects;

public class Oven extends KitchenAppliance implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int capacity;
	private int depth;

	public Oven()
	{
	}

	public Oven(String name, double price, int powerConsumption, int weight, double height, double width, int capacity,
			int depth)
	{
		super(name, price, powerConsumption, weight, height, width);
		this.capacity = capacity;
		this.depth = depth;
	}

	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}

	public int getCapacity()
	{
		return capacity;
	}

	public void setDepth(int depth)
	{
		this.depth = depth;
	}

	public int getDepth()
	{
		return depth;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capacity, depth);
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
		Oven other = (Oven) obj;
		return capacity == other.capacity && depth == other.depth;
	}

	@Override
	public String toString()
	{
		return "Oven [capacity=" + capacity + ", depth=" + depth + "]";
	}

}
