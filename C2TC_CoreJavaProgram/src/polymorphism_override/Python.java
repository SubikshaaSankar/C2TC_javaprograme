package polymorphism_override;

public class Python extends PLTraining  {
	
	@Override
	public void session (String language)
	{
		System.out.println("The sesssion going from "+language+ "in core python");
	}

}
