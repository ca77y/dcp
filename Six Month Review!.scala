
package pl.tom.algorithms.dailycode

/**
  * Lawrence here. Hope you're all doing great! I wanted to give you a quick update for you on Daily Coding Problem. It's been 6 months since we came up with the idea of a daily coding newsletter and it's hard to believe how much we've grown. Here's what's happened:
  * 
  * Numbers
  * 
  * DCP has had some amazing growth over the last few months. In particular:
  * 
  * An average of 80% user growth every month.
  *  As of this writing, a total of 5,277 subscribers.
  *  88% of you are consistently reading the problems.
  * 
  * Community
  * 
  * Even though the growth has been huge, I still like to keep in touch with people who write in. And it actually feels great when a subscriber cancels their subscription because they were able to land their dream job. If Daily Coding Problem has helped you in any way, we'd love to hear about it!
  * 
  * Among the readers we keep in touch with:
  * 
  * One has gotten into Apple
  *  Four have gotten into Google
  *  Three have gotten into Facebook
  *  And many others have landed jobs at other companies
  * 
  * If you're interested in well-written solutions to our questions by expert interviewers, check out our Premium plan! http://links.dailycodingproblem.com/wf/click?upn=-2F03iMydR750DKx07F4BRwWErdzWeRmfVcT48gFYejU-2Bz6QcOxyCKetP6lYnXnpQi2MQnlpcPatcptEpD88qkTdFojvny32f21ke0Ip1Orx0-3D_Zpop6UG5jBHMPmd8aQEO-2BHMWYuB2yncK6MXfgwzNZ1IJ7XpowX5-2B-2FVzrxj7G4jhl3g2GBju9PvR-2FcS2jtRyleCQriJ8dsVl5y5JJhSVrldq-2Fwv1jA2-2B4dUAHVFMuMJ-2BdXkJe9cKKWv4unh-2BwoAlCTp6WqFvnbRQlN1zq0ZWvwotOC16lqiL2LrpYZXGTSJLT7b8j-2B6LVwAsyiiz3H5nwKl2b7QIR32oyTJVwDNAm3yY-3D
  * 
  * Blog
  * 
  * We've had some great feedback on our blog posts. Here are some of the most popular posts that you might find useful:
  * 
  * How To Solve a Hard Programming Interview Question http://links.dailycodingproblem.com/wf/click?upn=-2F03iMydR750DKx07F4BRwWErdzWeRmfVcT48gFYejU-2FztADVYeklPEbUXzfcER3yQMZNoS7EdkvfE6JOfI-2BGNnclLK8SPKcaQ866k-2F7pfU6I8rXk5Da9WutAXoaO34rXSfdVahOUd8JmJSP6XZhlVA-3D-3D_Zpop6UG5jBHMPmd8aQEO-2BHMWYuB2yncK6MXfgwzNZ1IJ7XpowX5-2B-2FVzrxj7G4jhlnNRa61ppVQ3B50mtG8CcYoI3EhpWS5Rvzc4v-2FXHTy7ngXs4x5mjAFhQr5DLFfXcn96OhFoMBAMoxg0WC64FTkufDm5cdb-2FiQ4Ij2G9PKSDRQOwUiZlZUjNxaIGFAH2LFoLPtpCaFDs6JZ6dat9KmaKju-2BDmCbI-2FAld0KePrerTY-3D
  *  The Complete Guide To Getting A Full-Time Software Engineering Job http://links.dailycodingproblem.com/wf/click?upn=-2F03iMydR750DKx07F4BRwWErdzWeRmfVcT48gFYejU-2FztADVYeklPEbUXzfcER3y6c5vYK9GCEHiEUaQomsiF70nFGjin7PJchxolwUC0P1GHnGD7ZtydogpkoJCUAYBOsBzGrFISMM2mxW4-2FEp0SzRrzHZxldToiU6zY5QBEYw-3D_Zpop6UG5jBHMPmd8aQEO-2BHMWYuB2yncK6MXfgwzNZ1IJ7XpowX5-2B-2FVzrxj7G4jhl9ivwcbWwIFHlEhZi8-2BIHIx3OKN3jbtpkGBQeDxWdBmVAOBLVDHdnIV0omjtFViuJpA-2BiWwXpQTOGIlMye8dAD2NaO02NLUmqbv-2F9nkS9pkKWMNYRo47pMufN76Qz1e0T-2FWp7-2BDFVYsfNWXE-2FExJaE31pXaJg9BbJ2JTR-2BActmGM-3D
  *  An Introduction To Backtracking http://links.dailycodingproblem.com/wf/click?upn=-2F03iMydR750DKx07F4BRwWErdzWeRmfVcT48gFYejU-2FztADVYeklPEbUXzfcER3yHpXExKyE5MMCUuxORwLLyEJhNJd8WEs3dLed5g5maKI-3D_Zpop6UG5jBHMPmd8aQEO-2BHMWYuB2yncK6MXfgwzNZ1IJ7XpowX5-2B-2FVzrxj7G4jhlzDN9qtIg0-2Bx5VdO3m5lEt2e3AQXc3KwfwYSyXdbnu2-2FQKbVnGJgmr5-2FZZFdFjxLZY-2BnQHKthjUE64XJLmzUrmZHQ4wxewZfnsD-2FE0aNBdnqGnOP3Nio2-2FoCjMaSGxpw1sExJnpa7HBCdhJiEn2-2BBPC-2BOo-2FfOz8BcaVdaTIvgKZU-3D
  *  How to Formulaically Solve Tree Interview Questions http://links.dailycodingproblem.com/wf/click?upn=-2F03iMydR750DKx07F4BRwWErdzWeRmfVcT48gFYejU-2FztADVYeklPEbUXzfcER3yiTn183rCGVVdLIsC71FKFoqHU7zc-2FlEMvkMrcW9hYkZplcHp1UngY03333tpRm6l-2FEx-2BIYFH-2BDDgkwtYYBT-2FEw-3D-3D_Zpop6UG5jBHMPmd8aQEO-2BHMWYuB2yncK6MXfgwzNZ1IJ7XpowX5-2B-2FVzrxj7G4jhlZ1TexsgwABgrkZbrtIaiIrdG8BbC-2B5TJp5xaPBTUTwmh63ALLWqiBL2tjG27oUJuqsCaUKWfWW0ipiDE4WEmUxX2p-2BPBvOmIpcFBZRWD1z-2FfqdUWclSID4Gl3ieY2bgz5R9hXWxO92Flirw9dVweMTHN-2Fn6p2dOZ1hpwnfCKk5U-3D
  * 
  * We also got on the front page of Hacker News with our Indie Hackers post on achieving Ramen Profitability! http://links.dailycodingproblem.com/wf/click?upn=-2F03iMydR750DKx07F4BRwfqvxd9w5WS-2FPpfWgfhDsCBQPjr4YBt5mxb8jbtIrrqPeh8UuNyvtg1dwEd2nGrp-2FQFd3C-2BBkUrrDasKvLO3YeDUDxM0Lqy7Lpbs42Z18z5HpriUtLdYjhUJvIaQS4pgHllegvNMPAPNTVrSfw8jwwI-3D_Zpop6UG5jBHMPmd8aQEO-2BHMWYuB2yncK6MXfgwzNZ1IJ7XpowX5-2B-2FVzrxj7G4jhl2OvWoas54TnMDEhlObmzxsqRnQ-2FGJHJ3Av51Vt0OJ2AuDUwtGyloz89xtEShH565wbNRYfV2gxgIG-2Bi4LniZi0CC8LXiWcH3PQUylNw5UpqE4REBzLsDYPynknWxM-2BMcr-2B5llZiGidL6UtAdVeCIilblzbAtuuKFCUkHYP6ruxA-3D
  * 
  * Feedback
  * 
  * We've been constantly getting feedback and improving on making our questions clear and representative of actual interview questions. If a problem is unclear, or if you'd like to request a feature or report a bug, just reply to this email! My inbox is always open.
  * 
  * Best,
  *  Lawrence
  * 
  * No more? Unsubscribe http://links.dailycodingproblem.com/wf/click?upn=-2F03iMydR750DKx07F4BRwTq4x5HkPwxRhpDWfk1b7nXvgvDhSC78LLls-2Bvqs1KQvHGZzlxUHjTKmlyywaw1SPzcmfRP4sIk3PQxWd0KZIQAMcbrZFOie4VWWy1tBdd7UFvLqZM7YZTwuwFpBK95HbA-3D-3D_Zpop6UG5jBHMPmd8aQEO-2BHMWYuB2yncK6MXfgwzNZ1IJ7XpowX5-2B-2FVzrxj7G4jhlRGc-2Ff9Rw6gVrxTCrF6c6AX3x8EBTiCF4MpHr-2FOPqiJGcoUTZ45wGxbz1qBhW2-2FSlq9Jxa52bWUEAa-2F5cEhaIztxXL-2FtoOE2bMrcI39xs3m0SkZy04rjy0EINJI0jsGLsrKb92HKGW-2F0nP823d9t2TFSnXrQWkmgI5Ms3N0dONKY-3D
  */

object Six Month Review! {
  def solve(stack: Array[Int]): Array[Int] = {
    stack
  }

  def main(args: Array[String]): Unit = {
    assertResult(Array(1, 5, 2, 4, 3)) {
      solve(Array(1, 2, 3, 4, 5))
    }
  }
}

    