 void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int p = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[p])
                    p = j;
            int temp = arr[p];
            arr[p] = arr[i];
            arr[i] = temp;
        }
    }
