class SocialMediaPost
{
	public static void main(String[] args) 
	{
		SocialMediaPost obj=new SocialMediaPost();
		obj.createPost();
	}
	public void createPost()
	{
		generatePostId();
		publishPost();
	}
	public void publishPost()
	{
		System.out.println("PublishPost");
	}
	public static void generatePostId()
	{
		System.out.println("generatePostId");
	}
}


