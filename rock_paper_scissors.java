import java.lang.Math;
import java.util.Scanner;

class RockPaperScissors{
	public static void main(String[] args){
		System.out.println("Are you sure you want to fight the almighty RPS-Bot?!"
							+"\n---------------------------------------------------"
							+"\nn = no (all hail our machine overlords)"
							+"\ny = yes (you have been warned)");
		Scanner user_input = new Scanner(System.in);
		char menu_choice = user_input.next().charAt(0);
		clear_screen();
		System.out.println(menu_choice);
		clear_screen();
		if (menu_choice == 'y'){
			System.out.println("Fortune favors the brave.. Choose your weapon:"
								+"\n------------------------------------------"
								+"\n0 = Rock"
								+"\n1 = Paper"
								+"\n2 = Scissors");
			int user_choice = user_input.nextInt();
			clear_screen();
			int bot_choice = (int)(Math.random()*3);
			String[] choices = {"Rock","Paper","Scissors"};
			final int ROCK = 0;
			final int PAPER = 1;
			final int SCISSORS = 2;
			if (user_choice != ROCK && user_choice != PAPER && user_choice != SCISSORS){
				System.out.println("Sorry this is not a weapon");
			}
			else{
				System.out.println("You chose: " + choices[user_choice]
									+"\nThe RPS-Bot chose: " + choices[bot_choice]);
				if (user_choice == bot_choice){
					System.out.println("It's a draw - you live another day!");
				}
				else if (user_choice == ROCK){
					if (bot_choice == PAPER){
						System.out.println("You loose!");
					}
					else if (bot_choice == SCISSORS){
						System.out.println("The impossible happened - you WIN!");
					}
				}
				else if (user_choice == PAPER){
					if (bot_choice == ROCK){
						System.out.println("The impossible happened - you WIN!");
					}
					else if (bot_choice == SCISSORS){
						System.out.println("You loose!");
					}
				}
				else if (user_choice == SCISSORS){
					if (bot_choice == ROCK){
						System.out.println("You loose!");
					}
					else if (bot_choice == PAPER){
						System.out.println("The impossible happened - you WIN!");
					}
				}
			}
		}
		else if (menu_choice == 'n'){
			System.out.println("You escaped!");
		}
		else{
			System.out.println("Wrong input - are your fingers trembling with fear?!");
		}
	}
	private static void clear_screen(){
		try{
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")){
				//hopefully  this works on windows (didn't test)
				Runtime.getRuntime().exec("cls");
			}
			else{
				System.out.print("\033\143");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
