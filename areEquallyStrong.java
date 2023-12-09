boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    int yourWeak = Math.min(yourLeft, yourRight);
    int yourStrong = Math.max(yourLeft, yourRight);
    
    int friendsWeak = Math.min(friendsLeft, friendsRight);
    int friendsStrong = Math.max(friendsLeft, friendsRight);
    

    
    return (yourStrong == friendsStrong) && (yourWeak == friendsWeak);
}
