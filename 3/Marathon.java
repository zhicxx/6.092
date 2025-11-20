class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        int firstTime = Integer.MAX_VALUE;
        int secondTime = Integer.MAX_VALUE;
        String firstName = "";
        String secondName = "";

        for (int i = 0; i < names.length; i++) {
            if(times[i] < firstTime){
                secondTime = firstTime;
                secondName = firstName; //把原来的第一变成第二
                firstTime = times[i];
                firstName = names[i]; //新的第一
            }else if(times[i] < secondTime){
                secondTime = times[i]; 
                secondName = names[i]; //比在找第一中找到的第二还要快的
            }  
        }
        System.out.println(firstName + firstTime + secondName + secondTime);
    }
}