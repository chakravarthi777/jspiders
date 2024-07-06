class RecipeManager 
{
	public static void main(String[] args) 
	{
		System.out.println("main method");
		RecipeManager obj=new RecipeManager();
		obj.prepareRecipe();
	}

	//non-static methods
	public void addIngredient()
	{
		System.out.println("AddIngredient");
		//calling both non static methods
		removeIngredient();
		printRecipe();
	}
	public void removeIngredient()
	{
		System.out.println("removeIngredient");
		//calling the static method
		calculateTotalCalories();
	}
	public void prepareRecipe()
	{
		System.out.println("prepareRecipe");
		//calling non-static method
		addIngredient();
	}

	//static methods
	public static void calculateTotalCalories()
	{
		System.out.println("calculateTotalCalories");
	}
	public static void printRecipe()
	{
		System.out.println("Recipe");
	}
}
