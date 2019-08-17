package com.manalangjames.freshvotesapplication.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VOTES")
public class Vote {

    @EmbeddedId
    private VoteId pk;
    private boolean upvote;

    public boolean isUpvote() {
        return upvote;
    }

    public void setUpvote(boolean upvote) {
        this.upvote = upvote;
    }

    public VoteId getPk() {
        return pk;
    }

    public void setPk(VoteId pk) {
        this.pk = pk;
    }
}
