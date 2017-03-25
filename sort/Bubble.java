/**
 * Created by disinuo on 17/3/24.
 */
public void bubbleSort(){
    for(int i=0;i<length;i++){
        for(int j=0;j<length-i-1;j++){
            int a=array[j];
            int b=array[j+1];
            if(a>b){
                array[j]=b;
                array[j+1]=a;
            }
        }
    }
}
