public void quickSort(){
    quickSort(0,array.length-1);
}
private void quickSort(int low,int high){
    if(low<high){
        int keyIndex=doQuickSort(low,high);
        quickSort(low,keyIndex-1);
        quickSort(keyIndex+1,high);
    }
}
private int doQuickSort(int low,int high){
    int key=array[low];//第一个元素是基准
    int i=low,j=high;
    while(i<j){
        while(i<j&&array[j]>=key){
            j--;
        }//从右往左找到第一个小于key的数
        array[i]=array[j];//把这个数放在key所在的位置
        while (i<j&&array[i]<=key){
            i++;
        }//从左往右找到第一个大于key的数
        array[j]=array[i];//把这个数与key的新位置互换【讲道理key还没有变位置，但是它现在的位置是刚刚移走的array[j]给它空出来的位置
    }
    //然后把key归位~
    array[i]=key;
    //返回基准值的序号
    return i;
}
