public class test {
    public static void main(String[] args){
        sAuf(3);


    }

    public static void sAuf(int c){
        if(c<1){ 
            System.out.println("to low"); 
        }
        if(0<c){
            for(int i = 0; i<c; i++){
            System.out.println("*");
        }
        sAuf(c-1);



    }

}
}
