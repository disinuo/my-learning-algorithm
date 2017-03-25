public void insertSort_direct(){//直接插入
    for(int i=1;i<length;i++){
        int x=array[i];
        int j=i-1;
        for(;j>=0;j--){
            if(array[j]>x){
                array[j+1]=array[j];
            }else {
                break;
            }
        }
        array[j+1]=x;
    }
}
public void insertSort_division(){//二分法插入
    for(int i=1;i<length;i++){
        int x=array[i];
        int right=i-1;
        int left=0;
        int middle;
        while (left<=right){
            middle=(right+left)/2;
            if(array[middle]>x){
                right=middle-1;
            }else if(array[middle]<x){
                left=middle+1;
            }else {//考虑有重复数字的可能
                left=middle;
                break;
            }
        }
        for(int j=i;j>left;j--){
            array[j]=array[j-1];
        }
        array[left]=x;
    }
}
/*
 *参数n是初始步长
 */
public void insertSort_shell(int n){//希尔插入排序
  int step=n;
  while(step>=1){
    for(int i=0;i<step;i++){
      for(int j=i+step;j<length;j+=step){
        int x=array[j];
        int m=j-step;
        for(;m>=i;m-=step){
          if(array[m]>x){
            array[m+step]=array[m];
          }else {
            break;
          }
        }
        array[m+step]=x;
      }
    }
    step/=2;
  }
}
