public void bucketSort(int size) {
    int base=10;
    int[] counter=new int[base];
    int[] arrayTemp=new int[length];

   //initializing
    int rate=1;
    for(int i=0;i<size;i++){
        for(int t=0;t<length;t++){
            arrayTemp[t]=array[t];
        }
        for(int t=0;t<base;t++){
            counter[t]=0;
        }
        for(int x:array){
            int key=(x/rate)%base;
            counter[key]++;
        }
        for(int j=1;j<base;j++){
            counter[j]+=counter[j-1];
        }

        for(int j=length-1;j>=0;j--){
            int key=(arrayTemp[j]/rate)%base;
            array[--counter[key]]=arrayTemp[j];
        }
        rate*=base;
        printArray();

    }
}
