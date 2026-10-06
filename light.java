class light{
	public static void main(String args[])
	{
		int lightspeed;
		short days;
		long seconds;
		long distance;
		lightspeed=186000;
		days = 100;
		seconds = days*24*60*60;
		distance = lightspeed*seconds;
		System.out.print("In "+days);
		System.out.print("day light will travel about");
		System.out.println(distance+"miles.");
}
}