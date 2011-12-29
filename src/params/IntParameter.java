package params;

public class IntParameter extends NumberParameter<Integer> {

	public IntParameter(String key, String name, String description) {
		super(key, name, description);
		super.minValue = 0;
		super.maxValue = Integer.MAX_VALUE;
	}
	
	@Override
	public String parse(String value) {
		try {
			this.value = Integer.valueOf(value);
			if(this.value < minValue || this.value >= maxValue)
				return "must be in the range [" + minValue + "," + maxValue + ")";
		} catch (NumberFormatException e)
		{
			return "must be an integer";
		} 
		return null;
	}
}