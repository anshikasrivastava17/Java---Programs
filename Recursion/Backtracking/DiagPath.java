static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

       if(r > 1 && c > 1)
        path(p + 'D', r-1,c-1);  //diagonal

        if (r > 1) {
            path(p + 'H', r-1, c);  //horizontal or right
        }

        if (c > 1) {
            path(p + 'V', r, c-1);  //vertical or down
        }
    }
