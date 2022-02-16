package com.codingmore.service;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.codingmore.dto.PostsPageQueryParam;
import com.codingmore.model.Posts;
import com.baomidou.mybatisplus.extension.service.IService;
import com.codingmore.vo.PostsVo;

/**
 * <p>
 * 文章 服务类
 * </p>
 *
 * @author 石磊
 * @since 2021-09-12
 */
public interface IPostsService extends IService<Posts> {
 


    IPage<PostsVo> findByPage(PostsPageQueryParam postsPageQueryParam);

    List<Posts> listByTermTaxonomyId(Long termTaxonomyId);

    PostsVo getPostsById(Long id);
}
