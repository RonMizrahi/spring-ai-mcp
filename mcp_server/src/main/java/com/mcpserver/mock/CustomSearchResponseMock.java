package com.mcpserver.mock;

public class CustomSearchResponseMock {
    public static final String mockResponse = """
            {
              "kind": "customsearch#search",
              "url": {
                "type": "application/json",
                "template": "https://www.googleapis.com/customsearch/v1?q={searchTerms}&num={count?}&start={startIndex?}&lr={language?}&safe={safe?}&cx={cx?}&sort={sort?}&filter={filter?}&gl={gl?}&cr={cr?}&googlehost={googleHost?}&c2coff={disableCnTwTranslation?}&hq={hq?}&hl={hl?}&siteSearch={siteSearch?}&siteSearchFilter={siteSearchFilter?}&exactTerms={exactTerms?}&excludeTerms={excludeTerms?}&linkSite={linkSite?}&orTerms={orTerms?}&dateRestrict={dateRestrict?}&lowRange={lowRange?}&highRange={highRange?}&searchType={searchType}&fileType={fileType?}&rights={rights?}&imgSize={imgSize?}&imgType={imgType?}&imgColorType={imgColorType?}&imgDominantColor={imgDominantColor?}&alt=json"
              },
              "queries": {
                "request": [
                  {
                    "title": "Google Custom Search - facebook",
                    "totalResults": "22840000000",
                    "searchTerms": "facebook",
                    "count": 10,
                    "startIndex": 1,
                    "inputEncoding": "utf8",
                    "outputEncoding": "utf8",
                    "safe": "off",
                    "cx": "02338a2f09657410b"
                  }
                ],
                "nextPage": [
                  {
                    "title": "Google Custom Search - facebook",
                    "totalResults": "22840000000",
                    "searchTerms": "facebook",
                    "count": 10,
                    "startIndex": 11,
                    "inputEncoding": "utf8",
                    "outputEncoding": "utf8",
                    "safe": "off",
                    "cx": "02338a2f09657410b"
                  }
                ]
              },
              "context": {
                "title": "aigoogle"
              },
              "searchInformation": {
                "searchTime": 0.324551,
                "formattedSearchTime": "0.32",
                "totalResults": "22840000000",
                "formattedTotalResults": "22,840,000,000"
              },
              "items": [
                {
                  "kind": "customsearch#result",
                  "title": "Facebook - log in or sign up",
                  "htmlTitle": "\\u003cb\\u003eFacebook\\u003c/b\\u003e - log in or sign up",
                  "link": "https://www.facebook.com/",
                  "displayLink": "www.facebook.com",
                  "snippet": "Create an account or log into Facebook. Connect with friends, family and other people you know. Share photos and videos, send messages and get updates.",
                  "htmlSnippet": "Create an account or log into \\u003cb\\u003eFacebook\\u003c/b\\u003e. Connect with friends, family and other people you know. Share photos and videos, send messages and get updates.",
                  "formattedUrl": "https://www.facebook.com/",
                  "htmlFormattedUrl": "https://www.\\u003cb\\u003efacebook\\u003c/b\\u003e.com/",
                  "pagemap": {
                    "metatags": [
                      {
                        "referrer": "origin-when-crossorigin",
                        "theme-color": "#FFFFFF",
                        "og:type": "article",
                        "twitter:card": "summary",
                        "twitter:title": "Facebook - log in or sign up",
                        "viewport": "user-scalable=no,initial-scale=1,maximum-scale=1",
                        "twitter:description": "Create an account or log into Facebook. Connect with friends, family and other people you know. Share photos and videos, send messages and get updates.",
                        "og:title": "Facebook - log in or sign up",
                        "og:locale": "en_US",
                        "og:url": "https://www.facebook.com/",
                        "og:description": "Create an account or log into Facebook. Connect with friends, family and other people you know. Share photos and videos, send messages and get updates."
                      }
                    ]
                  }
                },
                {
                  "kind": "customsearch#result",
                  "title": "Facebook",
                  "htmlTitle": "\\u003cb\\u003eFacebook\\u003c/b\\u003e",
                  "link": "https://m.facebook.com/login/",
                  "displayLink": "m.facebook.com",
                  "snippet": "Facebook. English (US). Join Facebook. Connect with friends, family and communities of people who share your interests. Get started. I already have an account.",
                  "htmlSnippet": "\\u003cb\\u003eFacebook\\u003c/b\\u003e. English (US). Join \\u003cb\\u003eFacebook\\u003c/b\\u003e. Connect with friends, family and communities of people who share your interests. Get started. I already have an account.",
                  "formattedUrl": "https://m.facebook.com/login/",
                  "htmlFormattedUrl": "https://m.\\u003cb\\u003efacebook\\u003c/b\\u003e.com/login/",
                  "pagemap": {
                    "cse_thumbnail": [
                      {
                        "src": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8G7i_S-mqIyCGiRA-vrvGBbx7M6dJMfP1ZLbHKAl0BDmKlHMtZFmTHMgA&s",
                        "width": "344",
                        "height": "147"
                      }
                    ],
                    "metatags": [
                      {
                        "referrer": "origin-when-crossorigin",
                        "theme-color": "#FFFFFF",
                        "viewport": "user-scalable=no,initial-scale=1,maximum-scale=1"
                      }
                    ],
                    "cse_image": [
                      {
                        "src": "https://z-m-static.xx.fbcdn.net/rsrc.php/v4/yj/r/MB-kifFAcr-.png"
                      }
                    ]
                  }
                },
                {
                  "kind": "customsearch#result",
                  "title": "Facebook - log in or sign up",
                  "htmlTitle": "\\u003cb\\u003eFacebook\\u003c/b\\u003e - log in or sign up",
                  "link": "https://www.facebook.com/home.php",
                  "displayLink": "www.facebook.com",
                  "snippet": "Create an account or log into Facebook. Connect with friends, family and other people you know. Share photos and videos, send messages and get updates.",
                  "htmlSnippet": "Create an account or log into \\u003cb\\u003eFacebook\\u003c/b\\u003e. Connect with friends, family and other people you know. Share photos and videos, send messages and get updates.",
                  "formattedUrl": "https://www.facebook.com/home.php",
                  "htmlFormattedUrl": "https://www.\\u003cb\\u003efacebook\\u003c/b\\u003e.com/home.php",
                  "pagemap": {
                    "metatags": [
                      {
                        "referrer": "origin-when-crossorigin",
                        "theme-color": "#FFFFFF",
                        "og:type": "article",
                        "twitter:card": "summary",
                        "twitter:title": "Facebook - log in or sign up",
                        "viewport": "user-scalable=no,initial-scale=1,maximum-scale=1",
                        "twitter:description": "Create an account or log into Facebook. Connect with friends, family and other people you know. Share photos and videos, send messages and get updates.",
                        "og:title": "Facebook - log in or sign up",
                        "og:locale": "en_US",
                        "og:url": "https://www.facebook.com/",
                        "og:description": "Create an account or log into Facebook. Connect with friends, family and other people you know. Share photos and videos, send messages and get updates."
                      }
                    ]
                  }
                },
                {
                  "kind": "customsearch#result",
                  "title": "Meta for Developers: Social technologies",
                  "htmlTitle": "Meta for Developers: Social technologies",
                  "link": "https://developers.facebook.com/",
                  "displayLink": "developers.facebook.com",
                  "snippet": "Marketing API. Create, manage and optimize ad campaigns across the Meta family of apps including Facebook and Instagram. Learn more ...",
                  "htmlSnippet": "Marketing API. Create, manage and optimize ad campaigns across the Meta family of apps including \\u003cb\\u003eFacebook\\u003c/b\\u003e and Instagram. Learn more&nbsp;...",
                  "formattedUrl": "https://developers.facebook.com/",
                  "htmlFormattedUrl": "https://developers.\\u003cb\\u003efacebook\\u003c/b\\u003e.com/",
                  "pagemap": {
                    "metatags": [
                      {
                        "og:image": "https://scontent-atl3-1.xx.fbcdn.net/v/t39.2365-6/460333744_499701642975114_23354929635754091_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=e280be&_nc_ohc=FSxGQFGeX-MQ7kNvwEtiHZB&_nc_oc=AdnvAt-OCi5-Zk0SGmOnhRhSZ911hfj0Hgfr8YLotol7miSOCeQ-92w3RHYHpXiOEF4&_nc_zt=14&_nc_ht=scontent-atl3-1.xx&_nc_gid=B3yGPYHmQBpW_KOk1IYfRw&oh=00_AfFZmcUnCbPQ7BlrFoYa6PXAQ5jNqbOxt3JF3RwP9qrSgg&oe=6818CD6C",
                        "og:type": "website",
                        "twitter:card": "summary",
                        "og:site_name": "Meta for Developers",
                        "twitter:site:id": "63359297",
                        "og:title": "Social technologies | Meta for Developers",
                        "bingbot": "noarchive",
                        "og:description": "Social technologies that help developers grow, build community and monetize their apps.",
                        "referrer": "origin-when-crossorigin",
                        "fb:app_id": "113869198637480",
                        "viewport": "width=device-width, initial-scale=1",
                        "og:locale": "en_US",
                        "og:url": "https://developers.facebook.com/"
                      }
                    ],
                    "cse_image": [
                      {
                        "src": "https://scontent-atl3-1.xx.fbcdn.net/v/t39.2365-6/460333744_499701642975114_23354929635754091_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=e280be&_nc_ohc=FSxGQFGeX-MQ7kNvwEtiHZB&_nc_oc=AdnvAt-OCi5-Zk0SGmOnhRhSZ911hfj0Hgfr8YLotol7miSOCeQ-92w3RHYHpXiOEF4&_nc_zt=14&_nc_ht=scontent-atl3-1.xx&_nc_gid=B3yGPYHmQBpW_KOk1IYfRw&oh=00_AfFZmcUnCbPQ7BlrFoYa6PXAQ5jNqbOxt3JF3RwP9qrSgg&oe=6818CD6C"
                      }
                    ]
                  }
                },
                {
                  "kind": "customsearch#result",
                  "title": "Log into Facebook | Facebook",
                  "htmlTitle": "Log into \\u003cb\\u003eFacebook\\u003c/b\\u003e | \\u003cb\\u003eFacebook\\u003c/b\\u003e",
                  "link": "https://www.facebook.com/login/",
                  "displayLink": "www.facebook.com",
                  "snippet": "Log into Facebook to start sharing and connecting with your friends, family, and people you know.",
                  "htmlSnippet": "Log into \\u003cb\\u003eFacebook\\u003c/b\\u003e to start sharing and connecting with your friends, family, and people you know.",
                  "formattedUrl": "https://www.facebook.com/login/",
                  "htmlFormattedUrl": "https://www.\\u003cb\\u003efacebook\\u003c/b\\u003e.com/login/",
                  "pagemap": {
                    "metatags": [
                      {
                        "referrer": "origin-when-crossorigin",
                        "theme-color": "#FFFFFF",
                        "og:type": "article",
                        "twitter:card": "summary",
                        "twitter:title": "Log into Facebook | Facebook",
                        "viewport": "user-scalable=no,initial-scale=1,maximum-scale=1",
                        "twitter:description": "Log into Facebook to start sharing and connecting with your friends, family, and people you know.",
                        "og:title": "Log into Facebook | Facebook",
                        "og:locale": "en_US",
                        "og:url": "https://www.facebook.com/login/",
                        "og:description": "Log into Facebook to start sharing and connecting with your friends, family, and people you know."
                      }
                    ]
                  }
                },
                {
                  "kind": "customsearch#result",
                  "title": "Meta for Business (formerly Facebook for Business)",
                  "htmlTitle": "Meta for Business (formerly \\u003cb\\u003eFacebook\\u003c/b\\u003e for Business)",
                  "link": "https://business.facebook.com/",
                  "displayLink": "business.facebook.com",
                  "snippet": "Save time by accessing everything you need to manage your business across Facebook, Instagram and Messenger all in one place · Connect with the people who ...",
                  "htmlSnippet": "Save time by accessing everything you need to manage your business across \\u003cb\\u003eFacebook\\u003c/b\\u003e, Instagram and Messenger all in one place &middot; Connect with the people who&nbsp;...",
                  "formattedUrl": "https://business.facebook.com/",
                  "htmlFormattedUrl": "https://business.\\u003cb\\u003efacebook\\u003c/b\\u003e.com/",
                  "pagemap": {
                    "cse_thumbnail": [
                      {
                        "src": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS75f60ukkRvD1qf33Ey9Lb_1gS0Zvz0qyfKBVAgu9SSnLXlwyN-Hl7EcZ8&s",
                        "width": "152",
                        "height": "331"
                      }
                    ],
                    "metatags": [
                      {
                        "referrer": "origin-when-crossorigin",
                        "viewport": "width=device-width, initial-scale=1",
                        "bingbot": "noarchive"
                      }
                    ],
                    "cse_image": [
                      {
                        "src": "https://static.xx.fbcdn.net/rsrc.php/v4/yi/r/9nqXkCBBW2z.png"
                      }
                    ]
                  }
                },
                {
                  "kind": "customsearch#result",
                  "title": "Facebook on the App Store",
                  "htmlTitle": "\\u003cb\\u003eFacebook\\u003c/b\\u003e on the App Store",
                  "link": "https://apps.apple.com/us/app/facebook/id284882215",
                  "displayLink": "apps.apple.com",
                  "snippet": "5 days ago ... Facebook helps you make things happen like no other social network. Explore and expand your interests.",
                  "htmlSnippet": "5 days ago \\u003cb\\u003e...\\u003c/b\\u003e \\u003cb\\u003eFacebook\\u003c/b\\u003e helps you make things happen like no other social network. Explore and expand your interests.",
                  "formattedUrl": "https://apps.apple.com/us/app/facebook/id284882215",
                  "htmlFormattedUrl": "https://apps.apple.com/us/app/\\u003cb\\u003efacebook\\u003c/b\\u003e/id284882215",
                  "pagemap": {
                    "cse_thumbnail": [
                      {
                        "src": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3-KXK0AgnCKgeed1IRKAv7j1PL2LoUP6_fVg3lYBghY7XPRmuFnFF9M8&s",
                        "width": "310",
                        "height": "163"
                      }
                    ],
                    "metatags": [
                      {
                        "og:image": "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/a0/90/67/a0906789-28b5-7be1-9a34-73792264a034/Icon-Production-0-0-1x_U007epad-0-1-0-85-220.png/1200x630wa.png",
                        "og:image:width": "1200",
                        "twitter:card": "summary_large_image",
                        "og:site_name": "App Store",
                        "applicable-device": "pc,mobile",
                        "og:image:type": "image/png",
                        "og:description": "\\u200eWhere real people propel your curiosity. Whether you’re thrifting gear, showing a reel to that group who gets it, or sharing laughs over fun images reimagined by AI, Facebook helps you make things happen like no other social network.\\n\\nExplore and expand your interests: \\n* Ask Meta AI to search topic…",
                        "og:image:secure_url": "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/a0/90/67/a0906789-28b5-7be1-9a34-73792264a034/Icon-Production-0-0-1x_U007epad-0-1-0-85-220.png/1200x630wa.png",
                        "twitter:image": "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/a0/90/67/a0906789-28b5-7be1-9a34-73792264a034/Icon-Production-0-0-1x_U007epad-0-1-0-85-220.png/1200x600wa.png",
                        "web-experience-app/config/environment": "%7B%22appVersion%22%3A1%2C%22modulePrefix%22%3A%22web-experience-app%22%2C%22environment%22%3A%22production%22%2C%22rootURL%22%3A%22%2F%22%2C%22locationType%22%3A%22history-hash-router-scroll%22%2C%22historySupportMiddleware%22%3Atrue%2C%22EmberENV%22%3A%7B%22FEATURES%22%3A%7B%7D%2C%22EXTEND_PROTOTYPES%22%3A%7B%22Date%22%3Afalse%7D%2C%22_APPLICATION_TEMPLATE_WRAPPER%22%3Afalse%2C%22_DEFAULT_ASYNC_OBSERVERS%22%3Atrue%2C%22_JQUERY_INTEGRATION%22%3Afalse%2C%22_TEMPLATE_ONLY_GLIMMER_COMPONENTS%22%3Atrue%7D%2C%22APP%22%3A%7B%22PROGRESS_BAR_DELAY%22%3A3000%2C%22CLOCK_INTERVAL%22%3A1000%2C%22LOADING_SPINNER_SPY%22%3Atrue%2C%22BREAKPOINTS%22%3A%7B%22large%22%3A%7B%22min%22%3A1069%2C%22content%22%3A980%7D%2C%22medium%22%3A%7B%22min%22%3A735%2C%22max%22%3A1068%2C%22content%22%3A692%7D%2C%22small%22%3A%7B%22min%22%3A320%2C%22max%22%3A734%2C%22content%22%3A280%7D%7D%2C%22buildVariant%22%3A%22apps%22%2C%22name%22%3A%22web-experience-app%22%2C%22version%22%3A%222512.0.0%2Bb60a4bfc%22%7D%2C%22MEDIA_API%22%3A%7B%22token%22%3",
                        "twitter:image:alt": "Facebook on the App Store",
                        "twitter:site": "@AppStore",
                        "og:image:alt": "Facebook on the App Store",
                        "og:type": "website",
                        "twitter:title": "\\u200eFacebook",
                        "og:title": "\\u200eFacebook",
                        "og:image:height": "630",
                        "version": "2512.0.0",
                        "globalnav-search-suggestions-enabled": "false",
                        "viewport": "width=device-width, initial-scale=1, viewport-fit=cover",
                        "ac-gn-search-suggestions-enabled": "false",
                        "twitter:description": "\\u200eWhere real people propel your curiosity. Whether you’re thrifting gear, showing a reel to that group who gets it, or sharing laughs over fun images reimagined by AI, Facebook helps you make things happen like no other social network.\\n\\nExplore and expand your interests: \\n* Ask Meta AI to search topic…",
                        "og:locale": "en_US",
                        "apple:content_id": "284882215",
                        "og:url": "https://apps.apple.com/us/app/facebook/id284882215"
                      }
                    ],
                    "cse_image": [
                      {
                        "src": "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/a0/90/67/a0906789-28b5-7be1-9a34-73792264a034/Icon-Production-0-0-1x_U007epad-0-1-0-85-220.png/1200x630wa.png"
                      }
                    ]
                  }
                },
                {
                  "kind": "customsearch#result",
                  "title": "Meta Careers | Do the Most Meaningful Work of Your Career | Meta ...",
                  "htmlTitle": "Meta Careers | Do the Most Meaningful Work of Your Career | Meta ...",
                  "link": "https://www.metacareers.com/",
                  "displayLink": "www.metacareers.com",
                  "snippet": "... Facebook. It's a scalable way to leverage AI for interactive, impactful ... Facebook continues to make things happen like no other social network.",
                  "htmlSnippet": "... \\u003cb\\u003eFacebook\\u003c/b\\u003e. It&#39;s a scalable way to leverage AI for interactive, impactful ... \\u003cb\\u003eFacebook\\u003c/b\\u003e continues to make things happen like no other social network.",
                  "formattedUrl": "https://www.metacareers.com/",
                  "htmlFormattedUrl": "https://www.metacareers.com/",
                  "pagemap": {
                    "metatags": [
                      {
                        "referrer": "origin-when-crossorigin",
                        "og:image": "https://scontent-atl3-2.xx.fbcdn.net/v/t39.8562-6/465405730_1002056374941452_3170991748022491212_n.png?_nc_cat=104&ccb=1-7&_nc_sid=f537c7&_nc_ohc=VhFD1Yka3VAQ7kNvwEplhHx&_nc_oc=Adm4R0g9Bk5Kc7PGUzG7UEcU8DlhIfBHnkwE8WGiWs2TzHxsNKTidScqzFdybS7e1ys&_nc_zt=14&_nc_ht=scontent-atl3-2.xx&_nc_gid=X5Qnu4ywI8xd6BWn1oSAUg&oh=00_AfEJq-e5qeHPPr99uQDtWCXbccY188cFLIP4DD9y-lXQpg&oe=680455C4",
                        "og:type": "website",
                        "og:site_name": "Meta Careers",
                        "viewport": "width=device-width, initial-scale=1, minimum-scale=1",
                        "og:title": "Meta Careers | Do the Most Meaningful Work of Your Career",
                        "bingbot": "noarchive",
                        "og:url": "https://www.metacareers.com/",
                        "og:description": "Meta's mission is to to build the future of human connection and the technology that makes it possible.",
                        "facebook-domain-verification": "hxwxxk0gyolrw2tza2arx2h69obekq"
                      }
                    ],
                    "cse_image": [
                      {
                        "src": "https://scontent-atl3-2.xx.fbcdn.net/v/t39.8562-6/465405730_1002056374941452_3170991748022491212_n.png?_nc_cat=104&ccb=1-7&_nc_sid=f537c7&_nc_ohc=VhFD1Yka3VAQ7kNvwEplhHx&_nc_oc=Adm4R0g9Bk5Kc7PGUzG7UEcU8DlhIfBHnkwE8WGiWs2TzHxsNKTidScqzFdybS7e1ys&_nc_zt=14&_nc_ht=scontent-atl3-2.xx&_nc_gid=X5Qnu4ywI8xd6BWn1oSAUg&oh=00_AfEJq-e5qeHPPr99uQDtWCXbccY188cFLIP4DD9y-lXQpg&oe=680455C4"
                      }
                    ]
                  }
                },
                {
                  "kind": "customsearch#result",
                  "title": "Sharing Debugger - Meta for Developers",
                  "htmlTitle": "Sharing Debugger - Meta for Developers",
                  "link": "https://developers.facebook.com/tools/debug/",
                  "displayLink": "developers.facebook.com",
                  "snippet": "Sharing Debugger lets you preview how your content will look when it's shared to Facebook and debug any issues with your Open Graph tags.",
                  "htmlSnippet": "Sharing Debugger lets you preview how your content will look when it&#39;s shared to \\u003cb\\u003eFacebook\\u003c/b\\u003e and debug any issues with your Open Graph tags.",
                  "formattedUrl": "https://developers.facebook.com/tools/debug/",
                  "htmlFormattedUrl": "https://developers.\\u003cb\\u003efacebook\\u003c/b\\u003e.com/tools/debug/",
                  "pagemap": {
                    "cse_thumbnail": [
                      {
                        "src": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6V-1j2XeSf9d2VD8VZxLqfCNuZfzk0AInraG2gG0UPyCxhB2kh2zLico&s",
                        "width": "310",
                        "height": "163"
                      }
                    ],
                    "metatags": [
                      {
                        "referrer": "origin-when-crossorigin",
                        "og:image": "https://static.xx.fbcdn.net/rsrc.php/v4/y1/r/xGN4CvUH3Nz.png",
                        "fb:app_id": "113869198637480",
                        "og:type": "website",
                        "twitter:card": "summary",
                        "og:site_name": "Meta for Developers",
                        "twitter:site:id": "63359297",
                        "viewport": "width=device-width, initial-scale=1",
                        "og:title": "Sharing Debugger - Meta for Developers",
                        "og:locale": "en_US",
                        "bingbot": "noarchive",
                        "og:url": "https://developers.facebook.com/tools/debug/"
                      }
                    ],
                    "cse_image": [
                      {
                        "src": "https://static.xx.fbcdn.net/rsrc.php/v4/y1/r/xGN4CvUH3Nz.png"
                      }
                    ]
                  }
                },
                {
                  "kind": "customsearch#result",
                  "title": "Meta | Social Metaverse Company",
                  "htmlTitle": "Meta | Social Metaverse Company",
                  "link": "https://about.meta.com/",
                  "displayLink": "about.meta.com",
                  "snippet": "Meta (formerly the Facebook company) builds the future of human connection and the technology that makes it possible. We're moving beyond 2D screens and ...",
                  "htmlSnippet": "Meta (formerly the \\u003cb\\u003eFacebook\\u003c/b\\u003e company) builds the future of human connection and the technology that makes it possible. We&#39;re moving beyond 2D screens and&nbsp;...",
                  "formattedUrl": "https://about.meta.com/",
                  "htmlFormattedUrl": "https://about.meta.com/",
                  "pagemap": {
                    "cse_thumbnail": [
                      {
                        "src": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0FnCHPKqvK4Pcq_UYBKyDQeu4rJrkfnEQjc6VtzM3YatuoVx119ya2S-o&s",
                        "width": "200",
                        "height": "252"
                      }
                    ],
                    "metatags": [
                      {
                        "og:image": "https://lookaside.fbsbx.com/elementpath/media/?media_id=1586020438937751&version=1744234698",
                        "twitter:card": "Meta | Social Metaverse Company",
                        "og:type": "website",
                        "og:site_name": "Meta | Social Metaverse Company",
                        "msvalidate.01": "F26DE149442774285AE4BE9E36790FFB",
                        "og:title": "Meta | Social Metaverse Company",
                        "bingbot": "noarchive",
                        "title": "Meta | Social Metaverse Company",
                        "og:description": "Meta helps people, communities, and businesses do more together through our technologies and immersive experiences.",
                        "facebook-domain-verification": "fojmnjf56wmxz7ee1cu9koeann4ykf",
                        "referrer": "origin-when-crossorigin",
                        "viewport": "width=device-width, initial-scale=1",
                        "twitter:description": "Meta (formerly the Facebook company) builds the future of human connection and the technology that makes it possible. We're moving beyond 2D screens and into immersive experiences like virtual and augmented reality, helping create the next evolution of social technology.",
                        "og:url": "https://about.meta.com/"
                      }
                    ],
                    "cse_image": [
                      {
                        "src": "https://lookaside.fbsbx.com/elementpath/media/?media_id=1586020438937751&version=1744234698"
                      }
                    ]
                  }
                }
              ]
            }""";
}
