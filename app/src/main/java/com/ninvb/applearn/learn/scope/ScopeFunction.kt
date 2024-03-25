package com.ninvb.applearn.learn.scope

/**
 * normal function: with
 * extension function: let, run, apply, also
 *
 * => extension function check null de dang hon: test?.apply{}
 *
 *
 * it, this:
 *      - it la object va this la class => let, also
 *      - khong co it, this la object => apply, run, with
 *
 * return:
 *      - return object: apply, also
 *      - return anything: let, run, with
 */

class ScopeFunction {
    val a = arrayOf(1, 2, 3, 4, 5, 6)

    fun test() {
        a.apply {
            this
        }

        a.also {

        }
    }
}