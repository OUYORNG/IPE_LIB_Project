public class test {
 public static void main(String[] args) {
    int count = 0;
    int count1 = 0;
    for (int i = 1; i <=100 ; i++){
        if(i%4==0){
            count++;
        }
        else{
            count1++;
        }
            if(i%5==0){
                count++;
            }
            else{
                count1++;
            }
            if (i%7==0) {
                count++;
            }
            else{
                count1++;
            }
    }
    System.out.println(count);
    System.out.println(count1);
}
}