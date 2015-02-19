//Name: Sam Wang, ID: 108107971
//Class: CSE114, Prof. Fodor
//CSE114 Project
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Poker implements ActionListener {
	private static final String Serif = null;
	static int game=1;
	static int userscore=0;
	static int cpuscore=0;
	static int tie=0;
	
/////CONSTRUCTOR
	Poker(){
		/////FRAME
		JFrame frame = new JFrame("Poker");
		frame.setSize(1100, 700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		//Cards
		//Diamond
		JLabel diamond2 = new JLabel();
		diamond2.setIcon(new ImageIcon("images/diamond2.jpg"));
		JLabel diamond3 = new JLabel();
		diamond3.setIcon(new ImageIcon("images/diamond3.jpg"));
		JLabel diamond4 = new JLabel();
		diamond4.setIcon(new ImageIcon("images/diamond4.jpg"));
		JLabel diamond5 = new JLabel();
		diamond5.setIcon(new ImageIcon("images/diamond5.jpg"));
		JLabel diamond6 = new JLabel();
		diamond6.setIcon(new ImageIcon("images/diamond6.jpg"));
		JLabel diamond7 = new JLabel();
		diamond7.setIcon(new ImageIcon("images/diamond7.jpg"));
		JLabel diamond8 = new JLabel();
		diamond8.setIcon(new ImageIcon("images/diamond8.jpg"));
		JLabel diamond9 = new JLabel();
		diamond9.setIcon(new ImageIcon("images/diamond9.jpg"));
		JLabel diamond10 = new JLabel();
		diamond10.setIcon(new ImageIcon("images/diamond10.jpg"));
		JLabel diamondJ = new JLabel();
		diamondJ.setIcon(new ImageIcon("images/diamondJ.jpg"));
		JLabel diamondQ = new JLabel();
		diamondQ.setIcon(new ImageIcon("images/diamondQ.jpg"));
		JLabel diamondK = new JLabel();
		diamondK.setIcon(new ImageIcon("images/diamondK.jpg"));
		JLabel diamondA = new JLabel();
		diamondA.setIcon(new ImageIcon("images/diamondA.jpg"));
		//Club
		JLabel club2 = new JLabel();
		club2.setIcon(new ImageIcon("images/club2.jpg"));
		JLabel club3 = new JLabel();
		club3.setIcon(new ImageIcon("images/club3.jpg"));
		JLabel club4 = new JLabel();
		club4.setIcon(new ImageIcon("images/club4.jpg"));
		JLabel club5 = new JLabel();
		club5.setIcon(new ImageIcon("images/club5.jpg"));
		JLabel club6 = new JLabel();
		club6.setIcon(new ImageIcon("images/club6.jpg"));
		JLabel club7 = new JLabel();
		club7.setIcon(new ImageIcon("images/club7.jpg"));
		JLabel club8 = new JLabel();
		club8.setIcon(new ImageIcon("images/club8.jpg"));
		JLabel club9 = new JLabel();
		club9.setIcon(new ImageIcon("images/club9.jpg"));
		JLabel club10 = new JLabel();
		club10.setIcon(new ImageIcon("images/club10.jpg"));
		JLabel clubJ = new JLabel();
		clubJ.setIcon(new ImageIcon("images/clubJ.jpg"));
		JLabel clubQ = new JLabel();
		clubQ.setIcon(new ImageIcon("images/clubQ.jpg"));
		JLabel clubK = new JLabel();
		clubK.setIcon(new ImageIcon("images/clubK.jpg"));
		JLabel clubA = new JLabel();
		clubA.setIcon(new ImageIcon("images/clubA.jpg"));
		//Heart
		JLabel heart2 = new JLabel();
		heart2.setIcon(new ImageIcon("images/heart2.jpg"));
		JLabel heart3 = new JLabel();
		heart3.setIcon(new ImageIcon("images/heart3.jpg"));
		JLabel heart4 = new JLabel();
		heart4.setIcon(new ImageIcon("images/heart4.jpg"));
		JLabel heart5 = new JLabel();
		heart5.setIcon(new ImageIcon("images/heart5.jpg"));
		JLabel heart6 = new JLabel();
		heart6.setIcon(new ImageIcon("images/heart6.jpg"));
		JLabel heart7 = new JLabel();
		heart7.setIcon(new ImageIcon("images/heart7.jpg"));
		JLabel heart8 = new JLabel();
		heart8.setIcon(new ImageIcon("images/heart8.jpg"));
		JLabel heart9 = new JLabel();
		heart9.setIcon(new ImageIcon("images/heart9.jpg"));
		JLabel heart10 = new JLabel();
		heart10.setIcon(new ImageIcon("images/heart10.jpg"));
		JLabel heartJ = new JLabel();
		heartJ.setIcon(new ImageIcon("images/heartJ.jpg"));
		JLabel heartQ = new JLabel();
		heartQ.setIcon(new ImageIcon("images/heartQ.jpg"));
		JLabel heartK = new JLabel();
		heartK.setIcon(new ImageIcon("images/heartK.jpg"));
		JLabel heartA = new JLabel();
		heartA.setIcon(new ImageIcon("images/heartA.jpg"));
		//Spade
		JLabel spade2 = new JLabel();
		spade2.setIcon(new ImageIcon("images/spade2.jpg"));
		JLabel spade3 = new JLabel();
		spade3.setIcon(new ImageIcon("images/spade3.jpg"));
		JLabel spade4 = new JLabel();
		spade4.setIcon(new ImageIcon("images/spade4.jpg"));
		JLabel spade5 = new JLabel();
		spade5.setIcon(new ImageIcon("images/spade5.jpg"));
		JLabel spade6 = new JLabel();
		spade6.setIcon(new ImageIcon("images/spade6.jpg"));
		JLabel spade7 = new JLabel();
		spade7.setIcon(new ImageIcon("images/spade7.jpg"));
		JLabel spade8 = new JLabel();
		spade8.setIcon(new ImageIcon("images/spade8.jpg"));
		JLabel spade9 = new JLabel();
		spade9.setIcon(new ImageIcon("images/spade9.jpg"));
		JLabel spade10 = new JLabel();
		spade10.setIcon(new ImageIcon("images/spade10.jpg"));
		JLabel spadeJ = new JLabel();
		spadeJ.setIcon(new ImageIcon("images/spadeJ.jpg"));
		JLabel spadeQ = new JLabel();
		spadeQ.setIcon(new ImageIcon("images/spadeQ.jpg"));
		JLabel spadeK = new JLabel();
		spadeK.setIcon(new ImageIcon("images/spadeK.jpg"));
		JLabel spadeA = new JLabel();
		spadeA.setIcon(new ImageIcon("images/spadeA.jpg"));
		
				JLabel[][] cards = 
						{{clubA, club2, club3, club4, club5, club6, club7, club8, club9, club10, clubJ, clubQ, clubK},
						{diamondA, diamond2, diamond3, diamond4, diamond5, diamond6, diamond7, diamond8, diamond9, diamond10, diamondJ, diamondQ, diamondK},
						{heartA, heart2, heart3, heart4, heart5, heart6, heart7, heart8, heart9, heart10, heartJ, heartQ, heartK},
						{spadeA, spade2, spade3, spade4, spade5, spade6, spade7, spade8, spade9, spade10, spadeJ, spadeQ, spadeK}};
			/////User's Hand & Suit
				int[] UserHand = new int[5]; 
				int[] UserSuit = new int[5];
				////CPU's Hand & Suit
				int[] CPUHand = new int[5];
				int[] CPUSuit = new int[5];
				///Generator
				for(int i=0;i<5;i++){
					
					int temp1 =(int)(Math.random()*4);
					int temp2 =(int)(Math.random()*13);
					while(doublesearch(UserSuit, UserHand, temp1, temp2)==true || doublesearch(CPUSuit, CPUHand, temp1, temp2)==true){
						temp1 =(int)(Math.random()*4);
						temp2 =(int)(Math.random()*13);
					}
					
					UserSuit[i]=temp1;
					UserHand[i]=temp2;
					
					int temp3 =(int)(Math.random()*4);
					int temp4 =(int)(Math.random()*13);
					while(doublesearch(CPUSuit, CPUHand, temp3, temp4)==true || doublesearch(UserSuit, UserHand, temp3, temp4)==true){
						temp3 =(int)(Math.random()*4);
						temp4 =(int)(Math.random()*13);
					}
					CPUSuit[i]=temp3;
					CPUHand[i]=temp4;
					
				}
		//Hand One
				JPanel userpanel = new JPanel();
				userpanel.setBorder(new TitledBorder("User"));
				frame.add(userpanel);
				//Hand Two
				JPanel cpupanel = new JPanel();
				cpupanel.setBorder(new TitledBorder("CPU"));
				frame.add(cpupanel);
				
				JPanel screen = new JPanel();
				screen.add(new Label("Game: "+(game-1)));
				screen.add(new Label("User Score: "+userscore));
				screen.add(new Label("CPU Score: "+cpuscore));
				screen.add(new Label("Tie: "+tie));
				Color c1 = new Color(255,69,0);
				Color c2 = new Color(100,141,238);
				Color c3 = new Color(255,215,0);
				userpanel.setBackground(c1);
				cpupanel.setBackground(c2);
				screen.setBackground(c3);
				
				Font font = new Font(Serif, Font.BOLD, 18);
				Font font2 = new Font(Serif, Font.BOLD, 12);
				
				if(game==11){
					if(userscore<cpuscore){
						JLabel msg = new JLabel("CPU WINS THE GAME OF 10 ROUNDS");
						msg.setFont(font);
					screen.add(msg);
					
					;}
					if(userscore>cpuscore){
						JLabel msg = new JLabel("USER WINS THE GAME OF 10 ROUNDS");
						msg.setFont(font);
					screen.add(msg);
					;}
					if(userscore==cpuscore){
					JLabel msg = new JLabel("TIE, NOBODY WINS THE GAME OF 10 ROUNDS");
						msg.setFont(font);
					screen.add(msg);
					;}
				}
				frame.add(screen);
/////ADDING CARDS***************
for(int i=0;i<5;i++){
				userpanel.add(cards[UserSuit[i]][UserHand[i]]);

				cpupanel.add(cards[CPUSuit[i]][CPUHand[i]]);
}
/////Hand Levels
		int ULevel =identify(UserHand,UserSuit);
		int CLevel =identify(CPUHand,CPUSuit);
		//BATTLE
		int[] sorteduser = sort(UserHand);
		int[] sortedcpu = sort(CPUHand);
		if(battle(ULevel,CLevel,sorteduser,sortedcpu)==0){
			//USER WIN
			JLabel msg = new JLabel("User wins this round");
			msg.setFont(font2);
		screen.add(msg);
			userscore++;
		}
		else if(battle(ULevel,CLevel,sorteduser,sortedcpu)==1){
			//CPU WIN
			JLabel msg = new JLabel("CPU wins this round!");
			msg.setFont(font2);
		screen.add(msg);
			cpuscore++;
		}
		else if(battle(ULevel,CLevel,sorteduser,sortedcpu)==2){
			//TIE
			JLabel msg = new JLabel("It's a tie, nobody wins this round!");
			msg.setFont(font2);
		screen.add(msg);
			tie++;
		}
		JButton Next = new JButton("NEXT");
		screen.add(Next);
		Next.addActionListener(this);
		frame.setVisible(true);	
	}
/////END CONSTRUCTOR
	
	//////////MAIN/////
	public static void main(String[] args){
		Poker Game = new Poker();
	}
//////////END MAIN/////
	//0 = user win, 1= cpu win 2= tie
	public static int battle(int user, int cpu, int[] userhand, int[] cpuhand){
		if(user>cpu){
			return 0;
		}
		else if(cpu>user){
			return 1;
		}
		else if(cpu==user){
			
			if(userhand[0]!=0 && cpuhand[0]!=0){
			if(user==0 && cpu==0 || user==8 && cpu==8 || user==5 && cpu==5 || user==4 && cpu==4){
				if(userhand[userhand.length-1]>cpuhand[cpuhand.length-1]){
					return 0;
				}
				else if(userhand[userhand.length-1]<cpuhand[cpuhand.length-1]){
					return 1;
				}
				else if(userhand[userhand.length-1]==cpuhand[cpuhand.length-1]){
					return 2;
				}
			}
			else{
			
				if(user==7 && cpu==7){
					if(quadhigh(userhand)>quadhigh(cpuhand)){
						return 0;
					}
					else if(quadhigh(userhand)<quadhigh(cpuhand)){
						return 1;
					}
					else if(quadhigh(userhand)==quadhigh(cpuhand)){
						if(eliminate(userhand)>eliminate(cpuhand)){
							return 0;
						}
						else if(eliminate(userhand)<eliminate(cpuhand)){
							return 1;
						}
						else if(eliminate(userhand)==eliminate(cpuhand)){
							return 2;
						}
					}
				}
				else if(user==3 && cpu==3){
					if(trihigh(userhand)>trihigh(cpuhand)){
						return 0;
					}
					else if(trihigh(userhand)<trihigh(cpuhand)){
						return 1;
					}
					else if(trihigh(userhand)==trihigh(cpuhand)){
						if(eliminate(userhand)>eliminate(cpuhand)){
							return 0;
						}
						else if(eliminate(userhand)<eliminate(cpuhand)){
							return 1;
						}
						else if(eliminate(userhand)==eliminate(cpuhand)){
							
							if(eliminate1sthi(userhand)>eliminate1sthi(cpuhand)){
								return 0;
							}
							else if(eliminate1sthi(userhand)<eliminate1sthi(cpuhand)){
								return 1;
							}
							else if(eliminate1sthi(userhand)==eliminate1sthi(cpuhand)){
								return 2;
							}
						}
					}
				}
				else if(user==1 && cpu==1){
					if(doublehigh(userhand)>doublehigh(cpuhand)){
						return 0;
					}
					else if(doublehigh(userhand)<doublehigh(cpuhand)){
						return 1;
					}
					else if(doublehigh(cpuhand)==doublehigh(userhand)){
						if(eliminate(userhand)>eliminate(cpuhand)){
							return 0;
						}
						else if(eliminate(userhand)<eliminate(cpuhand)){
							return 1;
						}
						else if(eliminate(userhand)==eliminate(cpuhand)){
							
							if(eliminate1sthi(userhand)>eliminate1sthi(cpuhand)){
								return 0;
							}
							else if(eliminate1sthi(userhand)<eliminate1sthi(cpuhand)){
								return 1;
							}
							else if(eliminate1sthi(userhand)==eliminate1sthi(cpuhand)){

								if(eliminate2hi(userhand)>eliminate2hi(cpuhand)){
									return 0;
								}
								else if(eliminate2hi(userhand)<eliminate2hi(cpuhand)){
									return 1;
								}
								else if(eliminate2hi(userhand)==eliminate2hi(cpuhand)){
									return 2;
								}
								
							}
						}
					}
				}
				else if(user==2 && cpu==2){
					if(beliminate(userhand)>beliminate(cpuhand)){
						return 0;
					}
					else if(beliminate(userhand)<beliminate(cpuhand)){
						return 1;
					}
					else if(beliminate(userhand)==beliminate(cpuhand)){
						if(eliminate(userhand)>eliminate(cpuhand)){
							return 0;
						}
						else if(eliminate(userhand)<eliminate(cpuhand)){
							return 1;
						}
						else if(eliminate(userhand)==eliminate(cpuhand)){
							return 2;
						}
					}
				}
				else if(cpu==6 && user==6){
				if(triliminate(userhand)>triliminate(cpuhand)){
					return 0;
				}
				else if(triliminate(userhand)<triliminate(cpuhand)){
					return 1;
				}
				else if(triliminate(userhand)==triliminate(cpuhand)){

					if(beliminate(userhand)>beliminate(cpuhand)){
						return 0;
					}
					else if(beliminate(userhand)<beliminate(cpuhand)){
						return 1;
					}
					else if(beliminate(userhand)==beliminate(cpuhand)){
						
							return 2;
					}
				}
				}
			
			}
			}
			else if(userhand[0]==0 && cpuhand[0]!=0){
				return 0;
			}
			else if(userhand[0]!=0 && cpuhand[0]==0){
				return 1;
			}
			else if(userhand[0]==0 && cpuhand[0]==0){
				return 2;
			}
		}
		return -1;
	}
	///(0)=high, (1)=pair,(2)=2pair,(3)=triple, (4)=straight, (5)=flush, (6)=full-house, (7)=quadruple, (8)=straight-flush
	public static int identify(int[] hand, int[] suit){
		if(checkflush(suit)==true){
			int[] a = sort(hand);
			if(checkstraight(a)==true || checkAstraight(a)==true){
				return 8;
			}
			else{
				return 5;
			}
		}
		else{
			int[] a = sort(hand);
			if(checkstraight(a)==true || checkAstraight(a)==true){
				return 4;
			}
			else{
				int[] counter = counter(a);
				
				if(checkoccur(counter,4)==4){
					return 7;
				}
				else if(checkoccur(counter,3)==3 && checkoccur(counter,2)==2){
					return 6;
				}
				else if(checkoccur(counter,3)==3 && checkoccur(counter,2)!=2){
					return 3;
				}
				else if(checkoccur(counter,3)!=3 && checkoccur(counter,2)==2){
					return 1;
				}
				else if(checkoccur(counter,2)==4){
					return 2;
				}
				else if(checkoccur(counter,1)==5){
					return 0;
				}
			}
		}
		return 0;
	}
	public static boolean checkAstraight(int[] a){
		if(a[0]==0){
			if(a[1]==9 && a[2]==10 && a[3]==11 && a[4]==12){
				return true;
			}
			else{
				return false;
			}
		
		}
		else{
			return false;
		}
	}
	public static boolean checkstraight(int[] a){
		for(int i=0;i<a.length-1;i++){
			if(a[i]==a[i+1]-1){	
			}
			else{
				return false;
			}
		}return true;}
	public static boolean checkflush(int[] a){
		int temp = a[0];
		for(int i=0;i<a.length;i++){
			if(temp!=a[i]){
				return false;
			}}return true;}	
	public static int[] sort(int[] list){
		boolean changed = true;
		do{
			changed = false;
			for(int j=0; j<list.length-1;j++){
				if(list[j]>list[j+1]){
					int a = list[j];
					list[j]=list[j+1];
					list[j+1]=a;
					changed = true;
				}
			}
		}while(changed);
				return list;}	
	public static int[] counter(int[] a){
		int[] counter = new int[a.length];
		for(int k=0;k<a.length;k++){
		for(int i=0;i<a.length;i++){
			if(a[k]==a[i]){
				counter[k]++;
			}
		}
		}
		return counter;
	}
	public static int checkoccur(int[] a, int b){
		int counter =0;
		for(int i=0;i<a.length;i++){
			if(a[i]==b){
				counter++;
			}
		}
		return counter;
	}
	public static int trihigh(int[] a){
		for(int i=0;i<a.length;i++){
			int temp=0;
			for(int k=0;k<a.length;k++){
				if(a[i]==a[k]){
				temp++;
				}
				if(temp==3){
					return a[i];
				}
			}
		}
		return -1;
	}
	public static int doublehigh(int[] a){
		for(int i=0;i<a.length;i++){
			int temp=0;
			for(int k=0;k<a.length;k++){
				if(a[i]==a[k]){
				temp++;
				}
				if(temp==2){
					return a[i];
				}
			}
		}
		return -1;
	}
	public static int quadhigh(int[] a){
		for(int i=0;i<a.length;i++){
			int temp=0;
			for(int k=0;k<a.length;k++){
				if(a[i]==a[k]){
				temp++;
				}
				if(temp==4){
					return a[i];
				}
			}
		}
		return -1;
	}
	public static int eliminate(int[] a){
		for(int i=0;i<a.length;i++){
			int temp=0;
			for(int k=0;k<a.length;k++){
				if(a[i]==a[k]){
				temp++;
				}
			}
			if (temp>1){
				a[i]=-1;
		}
		}
		return checkhigh(a);
	}
	public static int eliminate1sthi(int[] a){
		a[a.length-1]=-1;
				return checkhigh(a);
	}
	public static int eliminate2hi(int[] a){
		a[a.length-1]=-1;
		a[a.length-2]=-1;
				return checkhigh(a);
	}
	public static int checkhigh(int[] a){
		int temp = a[0];
		for(int i=0;i<5;i++){
			if(a[i]>temp){
				temp=a[i];
			}}return temp;}
	public static int beliminate(int[] a){
		for(int i=0;i<a.length;i++){
			int temp=0;
			for(int k=0;k<a.length;k++){
				if(a[i]==a[k]){
				temp++;
				}
			}
			if (temp<=1){
				a[i]=-1;
		}
		}
		return checkhigh(a);
	}
	public static int triliminate(int[] a){
		for(int i=0;i<a.length;i++){
			int temp=0;
			for(int k=0;k<a.length;k++){
				if(a[i]==a[k]){
				temp++;
				}
			}
			if (temp<3){
				a[i]=-1;
		}
		}
		return checkhigh(a);
	}
	public void actionPerformed(ActionEvent e) {
		game++;
		if(game<12){
			Poker Game = new Poker();
			
		}
	}
	public static boolean doublesearch(int[] a, int[] b, int c, int d){
		for(int i=0;i<5;i++){
			if(a[i]==c && b[i]==d){
				return true;
			}
		}
		return false;
	}
}
