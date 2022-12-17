/*-----------------------------------ARRAY--------------------------------------*/




class Array{
int[] arr = new int[20];


// Traversal:
void Traversal(int size){

for(int i=0; i<size; i++){

    System.out.println(arr[i]);
}
}

/*************************************/

// Insert at first index:
void InsertAtFirstIndex(int data, int size){
    for(int i=size; i>0; i--){
     
        arr[i] = arr[i-1];
        
    }
        arr[0]= data;
    }
    
/*************************************/



    // Insert at any index:
    void InsertAtAnyIndex(int data, int index,int size){

    for(int i=size; i>index-1; i--){
  
        arr[i] = arr[i-1];
    }
            arr[index-1]= data;   
         
}
/*************************************/


// Deletion at first index:
void DeleteFromFirstIndex(int size){
    for(int i=0; i<size; i++){
     
        arr[i] = arr[i+1];
        
    }
       
    }
    
/*************************************/



    // Deletion at any index:
    void DeleteFromAnyIndex(int index,int size){

    for(int i=index-1; i<size; i++){
  
        arr[i] = arr[i+1];
    }
           
         
}
/*************************************/



// Updation:

void Update(int data, int index, int size){

arr[index-1] = data;

}
/*************************************/



// Linear Search for Un-Sorted Array:
void LinearSearch(int data,int size){
int a=0;
for(int i=0; i<size; i++){


    if(arr[i]==data)
    {
    System.out.println(data+" is found at index = "+(i+1));
    a++;
   }
}
if(a==0){

    System.out.println("Not found!");
}
}

/*************************************/



// Binary Search for Sorted Array:
void BinarySearch(int data,int size){
    int a=0;
    int first=0;
    int last=size-1;
    int middle;

    while(first<last){
  
    middle=first+last/2;
    
        if(data==arr[middle])
        {
        System.out.println(data+" is found at index = "+(middle+1));
        a++;
        break;

       }
       else if(data<arr[middle]){
          last = middle;
       }

       else{

        first = middle;
       }
    }
    if(a==0){
    
        System.out.println("Not found!");
    }
    }
    
    /*************************************/

}


class ArrayDS {


    public static void main(String[] Arge) {

        Array a = new Array();
        a.arr[0] = 11;
        a.arr[1] = 22;
        a.arr[2] = 33;
        a.arr[3] = 44;
        a.arr[4] = 55;

       // a.InsertAtFirstIndex(77, 5);
       // a.InsertAtAnyIndex(44, 5, 5);

       // a.DeleteFromFirstIndex(5);
       // a.DeleteFromAnyIndex(2, 5);

       // a.Update(88, 2, 5);

       // a.Traversal(5);

       // a.LinearSearch(22, 5);

       // a.BinarySearch(33, 5);



    }
}