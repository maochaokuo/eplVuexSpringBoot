package com.epl.eplspringbootapi.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "article", schema = "dbo", catalog = "eplDB")
public class ArticleEntity {
    private int articleId;
    private Date createtime;
    private String articleSubject;
    private String articleContentHtml;
    private String articleContentText;
    private boolean isDirectory;
    private Integer parentDirectoryId;
    private String articleType;

    @Id
    @Column(name = "articleID")
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "createtime")
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "articleSubject")
    public String getArticleSubject() {
        return articleSubject;
    }

    public void setArticleSubject(String articleSubject) {
        this.articleSubject = articleSubject;
    }

    @Basic
    @Column(name = "articleContentHtml")
    public String getArticleContentHtml() {
        return articleContentHtml;
    }

    public void setArticleContentHtml(String articleContentHtml) {
        this.articleContentHtml = articleContentHtml;
    }

    @Basic
    @Column(name = "articleContentText")
    public String getArticleContentText() {
        return articleContentText;
    }

    public void setArticleContentText(String articleContentText) {
        this.articleContentText = articleContentText;
    }

    @Basic
    @Column(name = "isDirectory")
    public boolean isDirectory() {
        return isDirectory;
    }

    public void setDirectory(boolean directory) {
        isDirectory = directory;
    }

    @Basic
    @Column(name = "parentDirectoryID")
    public Integer getParentDirectoryId() {
        return parentDirectoryId;
    }

    public void setParentDirectoryId(Integer parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
    }

    @Basic
    @Column(name = "articleType")
    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleEntity that = (ArticleEntity) o;
        return articleId == that.articleId && isDirectory == that.isDirectory && Objects.equals(createtime, that.createtime) && Objects.equals(articleSubject, that.articleSubject) && Objects.equals(articleContentHtml, that.articleContentHtml) && Objects.equals(articleContentText, that.articleContentText) && Objects.equals(parentDirectoryId, that.parentDirectoryId) && Objects.equals(articleType, that.articleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, createtime, articleSubject, articleContentHtml, articleContentText, isDirectory, parentDirectoryId, articleType);
    }
}
