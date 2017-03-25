/**
 * Created by disinuo on 17/3/25.
 */
public void mergeSort(){
  doMergeSort(0,length-1);
}
private void doMergeSort(int start,int end){
   if(start==end){
       return ;
   }else{
       int mid=(start+end)/2;
       doMergeSort(start,mid);
       doMergeSort(mid+1,end);
       mergeArray(start,mid,end);
   }
}
private void mergeArray(int start,int mid,int end){
   int[] temp=new int[length];
   int i=start,n1=mid;
   int j=mid+1,n2=end;
   int p=0;
   while(i<=n1&&j<=n2){
       if(array[i]<array[j]){
           temp[p++]=array[i];
           i++;
       }else {
           temp[p++]=array[j];
           j++;
       }
   }
   while (i<=n1){
       temp[p++]=array[i];
       i++;
   }
   while (j<=n2){
       temp[p++]=array[j];
       j++;
   }
   for(i=start;i<=end;i++){
       array[i]=temp[i-start];
   }
}
