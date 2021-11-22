main = apply(apply(first, 10), (apply(sieve, (apply(from, 2)))))

first n l = if n == 0 then nil else (hd l)::(apply(apply(first, n-1), (tl l)))

from n = n :: (apply(from, (n+1)))

filter f l = if (null l) then nil 
             else if (hd l) - (((hd l) / f) * f) == 0 then apply(apply(filter, f), (tl l))
             else (hd l) :: apply(apply(filter, f), (tl l))
        
sieve l = if null l then nil
          else (hd l) ::(apply(sieve, apply(apply(filter, (hd l)), (tl l))))