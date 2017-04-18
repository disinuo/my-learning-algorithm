public void heapSort(){
    int numOfParent=length/2;
    for(int i=numOfParent;i>=0;i--){
        adjustHeap(i,length);
    }
    for(int i=length-1;i>0;i--){
        swap(0,i);
        adjustHeap(0,i);
    }

}

public void adjustHeap(int root,int len){
    int leftChild=leftChildOf(root);
    int rootValue=array[root];
    while(leftChild<len){
        if(leftChild!=len-1&&array[leftChild]<array[leftChild+1]){
            leftChild++;
        }
        if(array[leftChild]>rootValue){
            //把比根大的子树上移~
            array[root]=array[leftChild];
            root=leftChild;
            leftChild=leftChildOf(leftChild);
        }else {
            break;
        }
    }
    array[root]=rootValue;
}
public void swap(int a,int b){
    int temp=array[a];
    array[a]=array[b];
    array[b]=temp;
}

public int leftChildOf(int root){
    return 2*root+1;
}
