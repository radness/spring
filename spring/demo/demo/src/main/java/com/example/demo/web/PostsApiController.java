package com.example.demo.web;

import com.example.demo.service.post.PostService;
import com.example.demo.web.dto.PostsResponseDto;
import com.example.demo.web.dto.PostsSaveRequestDto;
import com.example.demo.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostService postService;
    private final String RESOURCE = "/api/v1/posts";

    @PostMapping(RESOURCE)
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postService.save(requestDto);
    }

    @PutMapping(RESOURCE + "/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postService.update(id, requestDto);
    }

    @GetMapping(RESOURCE + "/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postService.findById(id);
    }
}
