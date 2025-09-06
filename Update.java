public class Update {

    public static void upgrade(int num[]){
        for(int i=0;  i<num.length; i++){
            num[i]= num[i]+1;
        }
    }
    public static void main(String[] args) {
        int num[]= {1,2,3,4,5,5};
        upgrade(num);
        for(int i=0; i<num.length; i++){
            System.out.print(" "+num[i]);
        }
        System.out.println();
    }
}