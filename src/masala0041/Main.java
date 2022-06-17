package masala0041;

import java.util.Scanner;

class Main
{


    static int mergeSort(long arr[], int array_size)
    {
        long temp[] = new long[array_size];
        return _mergeSort(arr, temp, 0, array_size - 1);
    }

    static int _mergeSort(long arr[], long temp[],
                          int left, int right)
    {
        int mid, inv_count = 0;
        if (right > left)
        {


            mid = (right + left) / 2;

            inv_count = _mergeSort(arr, temp, left, mid);
            inv_count += _mergeSort(arr, temp, mid + 1, right);

            inv_count += merge(arr, temp, left,
                    mid + 1, right);
        }
        return inv_count;
    }

    static int merge(long arr[], long temp[], int left,
                     int mid, int right)
    {
        int i, j, k;
        int inv_count = 0;

        i = left;

        j = mid;


        k = left;

        while ((i <= mid - 1) && (j <= right))
        {
            if (arr[i] > 2 * arr[j])
            {
                inv_count += (mid - i);
                j++;
            }
            else
            {
                i++;
            }
        }

        i = left;

        j = mid;

        k = left;

        while ((i <= mid - 1) && (j <= right))
        {
            if (arr[i] <= arr[j])
            {
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
            }
        }


        while (i <= mid - 1)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];


        for (i = left; i <= right; i++)
            arr[i] = temp[i];

        return inv_count;
    }

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long arr[] = new long[100010];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(mergeSort(arr, n));
    }
}

