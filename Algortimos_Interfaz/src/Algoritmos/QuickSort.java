package Algoritmos;
public class QuickSort {
    private static void QuickSort(int[] v, int iz, int de) {
        int m;
        if (de > iz) {
            m = particion(v, iz, de);
            QuickSort(v, iz, m - 1);
            QuickSort(v, m + 1, de);
        }
    }

    public int[] getQuickSort(int[] v) {
        QuickSort(v, 0, v.length - 1);
        return v;
    }
    
    private static int particion(int[] v, int iz, int de) {
        int i, pivote;
        permuta(v, (iz + de) / 2, iz);
        pivote = v[iz];
        i = iz;
        for (int s = iz + 1; s <= de; s++){
            if (v[s] <= pivote) {
                i++;
                permuta(v, i, s);
            }
        }
        permuta(v, iz, i);
        
    return i;
    
    }
    
    private static void permuta(int[] a, int i, int j) {
        int t;
        t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
       
}

