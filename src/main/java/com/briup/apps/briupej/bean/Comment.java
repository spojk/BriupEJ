package com.briup.apps.briupej.bean;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_comment.id
     *
     * @mbg.generated Wed Jun 12 11:06:43 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_comment.content
     *
     * @mbg.generated Wed Jun 12 11:06:43 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_comment.comment_time
     *
     * @mbg.generated Wed Jun 12 11:06:43 CST 2019
     */
    private Long commentTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_comment.order_id
     *
     * @mbg.generated Wed Jun 12 11:06:43 CST 2019
     */
    private Long orderId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_comment.id
     *
     * @return the value of ej_comment.id
     *
     * @mbg.generated Wed Jun 12 11:06:43 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_comment.id
     *
     * @param id the value for ej_comment.id
     *
     * @mbg.generated Wed Jun 12 11:06:43 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_comment.content
     *
     * @return the value of ej_comment.content
     *
     * @mbg.generated Wed Jun 12 11:06:43 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_comment.content
     *
     * @param content the value for ej_comment.content
     *
     * @mbg.generated Wed Jun 12 11:06:43 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_comment.comment_time
     *
     * @return the value of ej_comment.comment_time
     *
     * @mbg.generated Wed Jun 12 11:06:43 CST 2019
     */
    public Long getCommentTime() {
        return commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_comment.comment_time
     *
     * @param commentTime the value for ej_comment.comment_time
     *
     * @mbg.generated Wed Jun 12 11:06:43 CST 2019
     */
    public void setCommentTime(Long commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_comment.order_id
     *
     * @return the value of ej_comment.order_id
     *
     * @mbg.generated Wed Jun 12 11:06:43 CST 2019
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_comment.order_id
     *
     * @param orderId the value for ej_comment.order_id
     *
     * @mbg.generated Wed Jun 12 11:06:43 CST 2019
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}