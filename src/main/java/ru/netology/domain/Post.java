package ru.netology.domain;

public class Post {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getGetReplyPostID() {
        return getReplyPostID;
    }

    public void setGetReplyPostID(int getReplyPostID) {
        this.getReplyPostID = getReplyPostID;
    }

    public int getFriendsOnly() {
        return FriendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        FriendsOnly = friendsOnly;
    }

    public ru.netology.domain.CommentsInfo getCommentsInfo() {
        return CommentsInfo;
    }

    public void setCommentsInfo(ru.netology.domain.CommentsInfo commentsInfo) {
        CommentsInfo = commentsInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public String getPostType() {
        return PostType;
    }

    public void setPostType(String postType) {
        PostType = postType;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public int getSignedId() {
        return signedId;
    }

    public void setSignedId(int signedId) {
        this.signedId = signedId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId; // поле из документации
    private int getReplyPostID; // поле из документации
    private int FriendsOnly; // поле из документации
    private CommentsInfo CommentsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс CommentsInfo
    private LikesInfo likesInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс LikesInfo
    private RepostsInfo repostsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс RepostsInfo
    private ViewsInfo viewsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс ViewsInfo
    private String PostType; // поле из документации
    private GeoInfo geoInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс GeoInfo
    private int signedId; // поле из документации
    private int canPin; // поле из документации
    private int canDelete; // поле из документации
    private int canEdit; // поле из документации
    private int isPinned; // поле из документации
    private int markedAsAds; // поле из документации
    private boolean isFavorite; // поле из документации
    private Donut donut; // в документации он типа object, под такой тип объекта мы создали отдельный класс Donut
    private int postponedId; // поле из документации

}
