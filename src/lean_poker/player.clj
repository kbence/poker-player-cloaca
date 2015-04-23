(ns lean-poker.player)

(def version "Cloaca - the hidden gem")

(defn bet-request
  [game-state]
  (+ 100 (* 900 (Math.random))))

(defn showdown
  [game-state]
  nil)
