package by.epam.catalog.appliance;

import java.io.Serializable;
import java.util.Objects;

public abstract class Appliance implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String name;
	private double price;

	public Appliance()
	{
	}

	public Appliance(String name, double price)
	{
		this.name = name;
		this.price = price;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public double getPrice()
	{
		return price;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString()
	{
		return "Appliance [name=" + name + ", price=" + price + "]";
	}

}
