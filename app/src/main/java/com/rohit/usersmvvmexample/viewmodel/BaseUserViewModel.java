package com.rohit.usersmvvmexample.viewmodel;

import android.databinding.Bindable;
import android.view.View;

import com.rohit.usersmvvmexample.BR;
import com.rohit.usersmvvmexample.baseUiComponents.interfaces.MvvmView;
import com.rohit.usersmvvmexample.baseUiComponents.viewModels.BaseViewModel;
import com.rohit.usersmvvmexample.models.User;

public abstract class BaseUserViewModel<V extends MvvmView> extends BaseViewModel<V> {

    //region Variables

    public long id;
    public String email;
    public String likes;
    public String imageUrl;
    public String fullName;
    public Integer likeDrawable;
    public Integer genderDrawable;
    public Integer likesTextVisibility;

    public User user;

    //endregion

    //region Constructor Methods

    public BaseUserViewModel(User user) {
        this.user = user;
    }

    //endregion

    //region Setter Methods

    public void setId(long id) {
        this.id = id;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setGenderDrawable(Integer genderDrawable) {
        this.genderDrawable = genderDrawable;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLikes(String likes) {
        this.likes = likes;
        notifyPropertyChanged(BR.likes);
    }

    public void setLikeDrawable(Integer likeDrawable) {
        this.likeDrawable = likeDrawable;
        notifyPropertyChanged(BR.likeDrawable);

    }

    public void setLikesTextVisibility(Integer likesTextVisibility) {
        this.likesTextVisibility = likesTextVisibility;
        notifyPropertyChanged(BR.likesTextVisibility);
    }

    //endregion

    //region Getter Methods

    @Bindable
    public String getLikes() {
        return likes;
    }

    @Bindable
    public Integer getLikesTextVisibility() {
        return likesTextVisibility;
    }

    @Bindable
    public Integer getLikeDrawable() {
        return likeDrawable;
    }

    //endregion

    //region Implemented Methods

    public void onLikeButtonCLicked(View view) {

    }

    public void update(User user, boolean isLast) {

    }

    //endregion

}
