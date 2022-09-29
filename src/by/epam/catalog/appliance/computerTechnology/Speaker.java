package by.epam.catalog.appliance.computerTechnology;

import java.io.Serializable;
import java.util.Objects;

import by.epam.catalog.appliance.Appliance;

public class Speaker extends Appliance implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int powerConsumption;
	private int numberOfSpeakers;
	private int frequencyRange;
	private int cordLength;

	public Speaker()
	{
            super();
	}

	public Speaker(String name, double price, int powerConsumption, int numberOfSpeakers, int frequencyRange,
			int cordLength)
	{
		super(name, price);
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLength = cordLength;
	}

	public void setPowerConsumption(int powerConsumption)
	{
		this.powerConsumption = powerConsumption;
	}

	public int getPowerConsumption()
	{
		return powerConsumption;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers)
	{
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public int getNumberOfSpeakers()
	{
		return numberOfSpeakers;
	}

	public void setFrequencyRange(int frequencyRange)
	{
		this.frequencyRange = frequencyRange;
	}

	public int getFrequencyRange()
	{
		return frequencyRange;
	}

	public void setCordLength(int cordLength)
	{
		this.cordLength = cordLength;
	}

	public int getCordLength()
	{
		return cordLength;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cordLength, frequencyRange, numberOfSpeakers, powerConsumption);
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
		Speaker other = (Speaker) obj;
		return cordLength == other.cordLength && frequencyRange == other.frequencyRange
				&& numberOfSpeakers == other.numberOfSpeakers && powerConsumption == other.powerConsumption;
	}

	@Override
	public String toString()
	{
		return "Speaker [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + "]";
	}

}
