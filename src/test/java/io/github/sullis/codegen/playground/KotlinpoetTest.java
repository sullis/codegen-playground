package io.github.sullis.codegen.playground;

import java.util.List;
import org.junit.jupiter.api.Test;

import com.squareup.kotlinpoet.ClassName;

import static org.assertj.core.api.Assertions.assertThat;


public class KotlinpoetTest {
  @Test
  void happyPath() {
    ClassName className = new ClassName("foobar", List.of("Hello"));
    assertThat(className.toString()).isEqualTo("foobar.Hello");
  }
}
