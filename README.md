# What's that? 

A simple bootstrap Clojurescript project. Includes a REPL with a cool readline (rebel/readlline), a [nREPL](https://nrepl.org/nrepl/index.html) with cidr/nrepl and cidr/piggieback to be able to execute code directly from Vim. See [this config file for Neovim](https://github.com/Phantas0s/.dotfiles/blob/master/nvim/pluggedconf/clojure/fireplace.nvimrc) to configure fireplace with a nREPL.

* To run dev: `clojure -M:dev`
* To compile for prod: `clojure -M:prod`

If you're new to Clojurescript, just install the [clojure CLI](https://clojure.org/guides/deps_and_cli), run a terminal, type `clj`, and you have a REPL. Then run some clojurescript.

If you want a better REPL, you can use [rebel-readline](https://github.com/bhauman/rebel-readline). You can run it directly with the command: 

```
clojure -Sdeps "{:deps {com.bhauman/rebel-readline {:mvn/version \"0.1.4\"}}}" -m rebel-readline.main`.
```

