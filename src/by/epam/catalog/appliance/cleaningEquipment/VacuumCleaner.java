package by.epam.catalog.appliance.cleaningEquipment;

import java.io.Serializable;
import java.util.Objects;

import by.epam.catalog.appliance.Appliance;

public class VacuumCleaner extends Appliance implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private int motorSpeed;
	private int cleaningWidth;

	public VacuumCleaner()
	{
            super();
	}

	public VacuumCleaner(String name, double price, int powerConsumption, String filterType, String bagType,
			String wandType, int motorSpeed, int cleaningWidth)
	{
		super(name, price);
		this.powerConsumption = powerConsumption;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeed = motorSpeed;
		this.cleaningWidth = cleaningWidth;
	}

	public void setPowerConsumption(int powerConsumption)
	{
		this.powerConsumption = powerConsumption;
	}

	public int getPowerConsumption()
	{
		return powerConsumption;
	}

	public void setFilterType(String filterType)
	{
		this.filterType = filterType;
	}

	public String getFilterType()
	{
		return filterType;
	}

	public void setBagType(String bagType)
	{
		this.bagType = bagType;
	}

	public String getBagType()
	{
		return bagType;
	}

	public void setWandType(String wandType)
	{
		this.wandType = wandType;
	}

	public String getWandType()
	{
		return wandType;
	}

	public void setMotorSpeed(int motorSpeed)
	{
		this.motorSpeed = motorSpeed;
	}

	public int getMotorSpeed()
	{
		return motorSpeed;
	}

	public void setCleaningWidth(int cleaningWidth)
	{
		this.cleaningWidth = cleaningWidth;
	}

	public int getCleaningWidth()
	{
		return cleaningWidth;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(bagType, cleaningWidth, filterType, motorSpeed, powerConsumption, wandType);
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
		VacuumCleaner other = (VacuumCleaner) obj;
		return Objects.equals(bagType, other.bagType) && cleaningWidth == other.cleaningWidth
				&& Objects.equals(filterType, other.filterType) && motorSpeed == other.motorSpeed
				&& powerConsumption == other.powerConsumption && Objects.equals(wandType, other.wandType);
	}

	@Override
	public String toString()
	{
		return "VacuumCleaner [powerConsumption=" + powerConsumption + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeed=" + motorSpeed + ", cleaningWidth=" + cleaningWidth
				+ "]";
	}

}
