package cn.xhb.blog.service;

import cn.xhb.blog.po.Comment;

import java.util.List;

/**
 * @author HaibiaoXu
 * @date Create in 15:26 2020/2/8
 * @modified By
 */
public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
 }
