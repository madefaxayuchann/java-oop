package programmer.zaman.now.data;

public class SocialMedia {
  String name;
}

final class Facebook extends SocialMedia {
  //  final method can't override in child class
  final void login(String username, String Password) {
    System.out.println();
  }

}

//class FakeFacebook extends Facebook {}