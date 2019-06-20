class Sort {

	public String input[] = {"123abc","ac987","987bns","daata","124bns"};
	
// Sort the array: If start with numeric it is new type
	private String[] process_sort(String[] request) {
		String temp;
		for (int i =0; i <request.length; i++) {
			for(int j =0; j <request.length; j ++) {
				if (input[i].compareTo(input[j]) > 0 ) {
					temp = input[j];
					input[j]= input[i];
					input[i]= temp;
				}
			}
		}
		return input;
	}
	
	private void quick_sort(String[] request,int begin,int end) {
		if (begin < end) {
			int partitionIndex = partition(request, begin, end);

			quick_sort(request, begin, partitionIndex -1);
			quick_sort(request, partitionIndex+1,end);
		}
	} 

	private int partition(String request[],int begin, int end){
		String pivot = request[end];
		int i = (begin-1);
		for (int j = begin;j< end; j++){
			if(request[j].compareTo(pivot)< 0 ){
				i++;
				String swpTemp = request[i];
				request[i] = request[j];
				request[j] = swpTemp;

			}
		}
		String swpTemp = request[i+1];
		request[i+1] = request[end];
		request[end] = swpTemp;

	return i+1;
	}
	public static void main (String args[]) {
		Sort sort = new Sort();
		sort.quick_sort(sort.input, 0 , sort.input.length-1);
		for(int i =0; i<sort.input.length; i++){
			System.out.println(sort.input[i]);
		}
	}
}
