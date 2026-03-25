package CardGame;

public class Hand {
    private Card[] hand;
    private int currentCard;

    public Hand() {
        currentCard = 0;
        hand = new Card[11];
    }

    public void addCard(Card c) {
        hand[currentCard] = c;
        currentCard += 1;

    }

    public String toString() {
        String s = "";
        for (int i = 0; i < currentCard; i++) {
            s += hand[i]+"\n";
        }
        return s;

    }
    public Card showCard(int n){
        return hand[n];
    }

    public void hitdeck(String b, Card d){
        if(b.equalsIgnoreCase("y")){
            hand[currentCard] =d;
            currentCard += 1;


        }
        else{
            System.out.println("player stands");

        }




    }


    public int countTotal(){

        int total=0;
        int aceTotal=1;
        int aceCount =0;

        for (int i = 0; i < currentCard; i++) {
            
            if(hand[i].getFace()=="king"){
                total+=10;
                
                
            }
            if(hand[i].getFace()=="Queen"){
                total+=10;
                
                
            }
            if(hand[i].getFace()=="Jack"){
                total+=10;
                
                
            }
            if(hand[i].getFace()=="Ten"){
                total+=10;
                
                
            }
            if(hand[i].getFace()=="Nine"){
                total+=9;
                
                
            }
            if(hand[i].getFace()=="Eight"){
                total+=8;
                
                
            }
            if(hand[i].getFace()=="Seven"){
                total+=7;
                
                
            }
            if(hand[i].getFace()=="Six"){
                total+=6;
                
                
            }
            if(hand[i].getFace()=="Five"){
                total+=5;
                
                
            }
            if(hand[i].getFace()=="Four"){
                total+=4;
                
                
            }
            if(hand[i].getFace()=="Three"){
                total+=3;
                
                
            }
            if(hand[i].getFace()=="Two"){
                total+=2;
                
                
            }
            if(hand[i].getFace()=="Ace"){
                aceCount += 1;
                if(aceTotal==1){
                    total+=11;

                }
                

                
                
                
            }
            if(total>21&&aceCount>0){
                total-=10;
                aceCount-=10;
            }

            
            

        }
        // if totla biger than 21 and aceCount bigger than 0 subtract 10 and 
        // 
        // repeat as long as I have more aces to convert from 11 to 1     
        if(total>21&&aceCount>0){
            total-=10;
            aceCount-=10;
        }  
        
        
        
        return total;

        



    }


    public int dealerPlays(String b, Card d){

        int total=0;
        int aceTotal=1;
        int aceCount =0;

        for (int i = 0; i < currentCard; i++) {
            
            if(hand[i].getFace()=="king"){
                total+=10;
                
                
            }
            if(hand[i].getFace()=="Queen"){
                total+=10;
                
                
            }
            if(hand[i].getFace()=="Jack"){
                total+=10;
                
                
            }
            if(hand[i].getFace()=="Ten"){
                total+=10;
                
                
            }
            if(hand[i].getFace()=="Nine"){
                total+=9;
                
                
            }
            if(hand[i].getFace()=="Eight"){
                total+=8;
                
                
            }
            if(hand[i].getFace()=="Seven"){
                total+=7;
                
                
            }
            if(hand[i].getFace()=="Six"){
                total+=6;
                
                
            }
            if(hand[i].getFace()=="Five"){
                total+=5;
                
                
            }
            if(hand[i].getFace()=="Four"){
                total+=4;
                
                
            }
            if(hand[i].getFace()=="Three"){
                total+=3;
                
                
            }
            if(hand[i].getFace()=="Two"){
                total+=2;
                
                
            }
            if(hand[i].getFace()=="Ace"){
                aceCount += 1;
                if(aceTotal==1){
                    total+=11;

                }
                

                
                
                
            }
            if(total>21&&aceCount>0){
                total-=10;
                aceCount-=10;
            }

            
            

        }
        // if totla biger than 21 and aceCount bigger than 0 subtract 10 and 
        // 
        // repeat as long as I have more aces to convert from 11 to 1     

        
        if(total>21&&aceCount>0){
            total-=10;
            aceCount-=10;
        }  

        if(total<17){
            hand[currentCard] =d;
            currentCard += 1;


        }

        
                return total;

        






    }


    public String whoWins(int num,int num2){

        if(num>21){
        


            return "player bust, dealer win";




        }





        //player wins without bust
        if(num>num2&&num<21){
        


            return "player wins";




        }

        if(num2>num&&num2<21){
        


            return "Dealer wins";




        }

        if(num2==num){
        


            return "push";




        }

        if(num<num2&&num2>21){
        


            return "player win, dealer bust";




        }
        if(num<21&&num2<21&&num>num2){
        


            return "player win";




        }
        if(num<21&&num2<21&&num<num2){
        


            return "Dealer win";




        }
        if(num2<num&&num<21){
        


            return "Player win";




        }


                return "Player wins";

        



    
    }

  

}
