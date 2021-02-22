package practice.com.jojoldu.book.springboot.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import practice.com.jojoldu.book.springboot.service.posts.PostsService;
import practice.com.jojoldu.book.springboot.web.dto.PostsSaveRequestDto;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/post1/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequsetDto requsetDto) {
        return postsService.update(id, requsetDto);

    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(PathVariable Long id){
        return postsService.findById(id);
    }


}
