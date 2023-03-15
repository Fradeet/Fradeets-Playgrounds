namespace MauiApp1_LearnMAUI;

public class PureCshrp : ContentPage
{
	public PureCshrp()
	{
		Content = new VerticalStackLayout
		{
			Children = {
                new Label { HorizontalOptions = LayoutOptions.Center, VerticalOptions = LayoutOptions.Center, Text = "Welcome to .NET MAUI!" },
				new Button { HorizontalOptions = LayoutOptions.Center, VerticalOptions = LayoutOptions.Center, Text = "A Pure Cshrp button.",},
				new Grid { HorizontalOptions = LayoutOptions.Center,
				VerticalOptions = LayoutOptions.Center,
				Children =
					{
                        new Button { HorizontalOptions = LayoutOptions.Center, VerticalOptions = LayoutOptions.Center, Text = "A Pure Cshrp button in Grid",}
                    }
				}
			}
		};
	}
}