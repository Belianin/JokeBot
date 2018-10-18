
public class FoodDialog implements Dialog{
	
	public String getName()
	{
		return "food";
	}

	@Override
	public Response respond(UserData user, String[] words) {
		if (words.length == 1)
			if (MixBot.food.containsKey(words[0]))
			{
				StringBuilder builder = new StringBuilder();
				builder.append("Для коктейля "  + words[0] + " вам понадобятся следующие ингредиенты:");
				for (Ingredient ing : MixBot.food.get(words[0]).ingrList)
					builder.append("\n" + ing.name);
				
				return new Response(builder.toString(), MixBot.dialogs.get("start"));
			}
		return new Response("Я не знаю такого блюда!", MixBot.dialogs.get("start"));
	}

	@Override
	public void addAction(String[] words, Response response) {
		// TODO Auto-generated method stub
		
	}

}